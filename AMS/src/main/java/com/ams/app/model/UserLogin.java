package com.ams.app.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "AMS_USER_LOGIN")
public class UserLogin {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "USER_ID")
        private int userId;
        
        @Column(name = "USER_NAME")
        private String userName;
        
        @Column(name = "USER_PASSWORD")
        private String userPassword;
        
        @Column(name = "USER_PAN_CARD")
        private String userPanCard;
        
        @OneToMany(fetch = FetchType.LAZY, mappedBy = "userLogin")
        @Cascade(org.hibernate.annotations.CascadeType.ALL)
        private Set<UserEntitlement> entitlementSet;
        
        public int getUserId() {
                return userId;
        }
        
        public void setUserId(int userId) {
                this.userId = userId;
        }
        
        public String getUserName() {
                return userName;
        }
        
        public void setUserName(String userName) {
                this.userName = userName;
        }
        
        public String getUserPassword() {
                return userPassword;
        }
        
        public void setUserPassword(String userPassword) {
                this.userPassword = userPassword;
        }
        
        public String getUserPanCard() {
                return userPanCard;
        }
        
        public void setUserPanCard(String userPanCard) {
                this.userPanCard = userPanCard;
        }
        
        public Set<UserEntitlement> getEntitlementSet() {
                return entitlementSet;
        }
        
        public void setEntitlementSet(Set<UserEntitlement> entitlementSet) {
                this.entitlementSet = entitlementSet;
        }
        
        public void addEntitlement(UserEntitlement userEntitlement){
                if(entitlementSet == null){
                        entitlementSet = new HashSet<>();
                }
                entitlementSet.add(userEntitlement);
                userEntitlement.setUserLogin(this);
        }
}
