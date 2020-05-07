import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import {AmsTabComponent} from './ams-tab/ams-tab.component'
import { from } from 'rxjs';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'amsTab', component: AmsTabComponent }
];
export const appRouting = RouterModule.forRoot(routes);

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
