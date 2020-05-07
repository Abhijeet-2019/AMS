package com.ams.app.controller;

import com.ams.app.model.UserEntitlement;
import com.ams.app.service.AuthenticationService;
import com.ams.app.utils.AmsResponseObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;


@RestController
@RequestMapping("/amsAuthentication")
@CrossOrigin
@Scope("prototype")
public class AuthenticationController {
        
        @Autowired
        private AuthenticationService authenticationService;
        
        private AmsResponseObj amsResponseObj;
        
        AuthenticationController() {
                amsResponseObj = new AmsResponseObj();
        }
        
        /**
         *
         * @param name
         * @param password
         * @param panCard
         * @return
         */
        @CrossOrigin
        @RequestMapping(
                value = "/authenticateUsers", method = RequestMethod.GET)
        public AmsResponseObj authenticateUser(@RequestParam(value = "name") String name,
                                               @RequestParam(value = "password") String password,
                                               @RequestParam(value = "panCard") String panCard) {
                Set<String> userEntitlementsType = new HashSet<String>();
                try {
                        Set<UserEntitlement> fetchEntitlement = authenticationService.fetchEntitlements(name, password, panCard);
                        fetchEntitlement.stream().forEach(entitlements -> {
                                userEntitlementsType.add( entitlements.getEntitlementType());
                        });
                        amsResponseObj.setResponseData(userEntitlementsType);
                        amsResponseObj.setResponseStatus(AmsResponseObj.SUCCESS);
                } catch (Exception e) {
                        amsResponseObj.setResponseStatus(AmsResponseObj.ERROR);
                        e.printStackTrace();
                }
                return amsResponseObj;
        }
        
}




