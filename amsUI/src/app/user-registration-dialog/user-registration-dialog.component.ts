import { Component, OnInit,Inject } from '@angular/core';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { NewUser } from '../model/new-user';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-registration-dialog',
  templateUrl: './user-registration-dialog.component.html',
  styleUrls: ['./user-registration-dialog.component.css']
})
export class UserRegistrationDialogComponent implements OnInit {

  message: string = ""
  cancelButtonText = "Cancel"

  newUser : NewUser = new NewUser("","","","","","","","","");
  ngOnInit(): void {
  }

  constructor(
    @Inject(MAT_DIALOG_DATA) private data: any,
    private dialogRef: MatDialogRef<UserRegistrationDialogComponent>) {
    if (data) {
      this.message = data.message || this.message;
      if (data.buttonText) {
        this.cancelButtonText = data.buttonText.cancel || this.cancelButtonText;
      }
    }
    // this.dialogRef.updateSize('300vw','300vw')
  }

  onConfirmClick(): void {
    this.dialogRef.close(true);
  }

  pleaseRegister(){
    alert("Submit me "+this.newUser.gender);
  }

}
