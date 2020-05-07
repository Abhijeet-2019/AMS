import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { User } from '../model/user';
import { error } from '@angular/compiler/src/util';
@Injectable({
  providedIn: 'root'
})
export class AmsHTTPServiceService {
  
  private isValid:boolean;
  private baseConnectionURL = 'http://localhost:8080/';

  constructor(private httpClient:HttpClient) { 
  }

  validateUserLogin(user: User){
    var validationURL = this.baseConnectionURL
    +"amsAuthentication/authenticateUsers?name="+user.customerId
    +"&password="+user.password+"&panCard="+user.panCard;
    return this.httpClient.get(validationURL).toPromise()
      .then((data:any)=>{
        return data;    
      })
      .catch((error)=>{
        alert("There is some connection error")
      });
  }
}
