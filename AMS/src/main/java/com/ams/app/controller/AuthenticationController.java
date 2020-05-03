package com.ams.app.controller;

import com.ams.app.service.AuthenticationService;
import com.ams.app.utils.AmsResponseObj;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/amsAuthentication")
@CrossOrigin
@Scope("prototype")
public class AuthenticationController {
        
        @Autowired
        private AuthenticationService authenticationService;
        
        private AmsResponseObj amsResponseObj;
        
        AuthenticationController(){
                amsResponseObj = new AmsResponseObj();
        }

        @CrossOrigin
        @RequestMapping(
                value = "/authenticateUsers", method = RequestMethod.GET)
        public AmsResponseObj authenticateUser(@RequestParam(value = "name") String name,
                                               @RequestParam(value = "password")String password,
                                               @RequestParam(value = "pancard")String pancard){
                try {
                        JSONObject userLoginCredentials = new JSONObject();
                        System.out.println("The name "+name);
                        amsResponseObj.setResponseStatus(AmsResponseObj.SUCCESS);
                        authenticationService.authenticateUser(name, password, pancard);
                }catch (Exception e){
                        amsResponseObj.setResponseStatus(AmsResponseObj.ERROR);
                        e.printStackTrace();
                }
                return amsResponseObj;
        }
        
}
