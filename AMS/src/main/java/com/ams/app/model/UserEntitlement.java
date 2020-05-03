package com.ams.app.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name = "AMS_ENTITLEMENT")
public class UserEntitlement {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ENTITLEMENT_ID")
        private String entitlementId;
        
//        @Column(name = "USER_ID")
//        private String userId;
        
        @Column(name = "ENTITLEMENT_TYPE")
        private String entitlementType;
        
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "USER_ID")
        @Fetch(FetchMode.JOIN)
        private UserLogin userLogin;
        
        public String getEntitlementId() {
                return entitlementId;
        }
        
        public void setEntitlementId(String entitlementId) {
                this.entitlementId = entitlementId;
        }
        
//        public String getUserId() {
//                return userId;
//        }
//
//        public void setUserId(String userId) {
//                this.userId = userId;
//        }
        
        public String getEntitlementType() {
                return entitlementType;
        }
        
        public void setEntitlementType(String entitlementType) {
                this.entitlementType = entitlementType;
        }
        
        public UserLogin getUserLogin() {
                return userLogin;
        }
        
        public void setUserLogin(UserLogin userLogin) {
                this.userLogin = userLogin;
        }
}
