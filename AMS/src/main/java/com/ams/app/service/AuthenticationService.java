package com.ams.app.service;

import com.ams.app.model.UserLogin;
import com.ams.app.repositories.UserLoginRepositories;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Set;

@Service
public class AuthenticationService {
        
        @Autowired
        UserLoginRepositories userLoginRepositories;
        
        /**
         * @return
         */
        public boolean authenticateUser(String userName, String password, String panCard ) {
                List<UserLogin> userRepoData = userLoginRepositories.findAll();
                if (!CollectionUtils.isEmpty(userRepoData)) {
                        System.out.println(userRepoData.size());
                }
                List<UserLogin> checkDetails = userLoginRepositories.
                        findAllByUserNameAndUserPassword(userName, password);
                if (!CollectionUtils.isEmpty(checkDetails)) {
                        System.out.println(checkDetails.size());
                        checkDetails.stream().forEach(userLogin->{
                                System.out.println("The pan card --->"+userLogin.getUserPanCard());
                                if(panCard.equalsIgnoreCase(userLogin.getUserPanCard())){
                                        System.out.println("The user is valid ");
                                }
                                Set entitlementSet = userLogin.getEntitlementSet();
                                System.out.println(" The entitlement Set-- "+entitlementSet);
                        });
                }
                return false;
        }
}
