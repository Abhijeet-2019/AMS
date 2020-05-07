import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { MatButtonModule } from "@angular/material/button";
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import {MatTabsModule, MatTab} from '@angular/material/tabs';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { TitleBannerComponent } from './title-banner/title-banner.component';
import { UserRegistrationDialogComponent } from './user-registration-dialog/user-registration-dialog.component';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import {MatDialogModule} from '@angular/material/dialog';
import {MatNativeDateModule} from '@angular/material/core';
import {MatRadioModule} from '@angular/material/radio';
import { AmsTabComponent } from './ams-tab/ams-tab.component';


@NgModule({
  declarations: [ 
    AppComponent,    
    LoginComponent,
    TitleBannerComponent,
    UserRegistrationDialogComponent,
    AmsTabComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,    
    MatButtonModule,
    MatDialogModule,
    FormsModule,
    MatInputModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatRadioModule,
    MatTabsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
