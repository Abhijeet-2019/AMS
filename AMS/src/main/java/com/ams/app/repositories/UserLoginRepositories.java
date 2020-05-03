package com.ams.app.repositories;

import com.ams.app.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserLoginRepositories extends JpaRepository <UserLogin, Long>{

        public List<UserLogin> findAllByUserNameAndUserPassword(String userName, String password);
        public List<UserLogin> findAllByUserNameAndUserPasswordAndUserPanCard(String userName, String password, String panCard);
}
