package com.ams.app.service;

import com.ams.app.model.UserEntitlement;
import com.ams.app.model.UserLogin;
import com.ams.app.repositories.UserLoginRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AuthenticationService {
        
        @Autowired
        UserLoginRepositories userLoginRepositories;
        
        /**
         *
         * @return
         */
        public Set<UserEntitlement> fetchEntitlements(String userName, String password, String panCard) {
                Set<UserEntitlement> entitlementSet = new HashSet<UserEntitlement>();
                List<UserLogin> fetchEntitlements =userLoginRepositories.
                        findAllByUserNameAndUserPasswordAndUserPanCard(userName,password,panCard);
                if (!CollectionUtils.isEmpty(fetchEntitlements)) {
                        fetchEntitlements.stream().forEach(userLogin -> {
                                if (panCard.equalsIgnoreCase(userLogin.getUserPanCard())) {
                                        entitlementSet.addAll(userLogin.getEntitlementSet());
                                }
                        });
                }
                return entitlementSet;
        }
}
