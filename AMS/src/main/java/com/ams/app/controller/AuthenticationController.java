package com.ams.app.controller;

import com.ams.app.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amsLogin")
@CrossOrigin
@Scope("prototype")
public class LoginController {

        @Autowired
        LoginService loginService;
        
}
