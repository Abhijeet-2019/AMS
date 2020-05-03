import { Component, OnInit ,Inject} from '@angular/core';
import { User } from "../model/user";
import{MatButtonModule} from "@angular/material/button"; 
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import {AmsHTTPServiceService} from'../service/ams-httpservice.service';
import { UserRegistrationDialogComponent } from '../user-registration-dialog/user-registration-dialog.component';
import { from } from 'rxjs';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginBanner = "Please Enter User Name";
  user: User = new User("", "", "", false);

  constructor(private dialog: MatDialog,
              private httpClientService:AmsHTTPServiceService) {     
  }

  ngOnInit(): void {
  }

  reset() :void{
    alert("Are u Sure to reset values?" + this.user.customerId);
    this.user.customerId = '';
    this.user.password = "";
    this.user.panCard = '';
  }
  login(){
    this.httpClientService.validateUserLogin(this.user).then(
      data => {
        if (data) {          
            console.log("data  --->>"+data);
            if(data.responseStatus =='SUCCESS'){
              alert(" Login Successfull")
            }
        }else{
          alert("Unable to connect to the server");
          // this.router.navigate(["ErrorPage"]);
        }
      }
    );
  }
 

  pleaseRegister(): void {
      const dialogRef = this.dialog.open(UserRegistrationDialogComponent,{
        data:{
          message: 'Register me !..',
          buttonText: {
            cancel: 'Close ME'
          }
        },
        backdropClass: 'custom-modalbox'
      });
  }
}