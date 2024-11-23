package com.example.recordsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.recordsystem.service.SignupService;

@Controller
public class SignupController {
    
    @Autowired
    SignupService service;

    @GetMapping("/user/signin")
    public String getSignup() {
        
        // signup.htmlに画面遷移
        return "user/signup";
    }
}
