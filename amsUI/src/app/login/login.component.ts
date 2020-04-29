import { Component, OnInit ,Inject} from '@angular/core';
import { User } from "../model/user";
import{MatButtonModule} from "@angular/material/button"; 
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';

import { UserRegistrationDialogComponent } from '../user-registration-dialog/user-registration-dialog.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginBanner = "Please Enter User Name";
  user: User = new User("", "", "", false, "");

  constructor(private dialog: MatDialog) { 
    
  }

  ngOnInit(): void {
  }

  reset() :void{
    alert("Are u Sure to reset values?" + this.user.customerId);
    this.user.customerId = '';
    this.user.password = "";
    this.user.pancard = '';
  }
  login(){
    alert("Submit now"+this.user.customerId);
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