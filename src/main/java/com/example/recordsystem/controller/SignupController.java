package com.example.recordsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.recordsystem.model.User;
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

    @PostMapping("/register")
    public String postSignup(@ModelAttribute User user, Model model) {
        
        // usersテーブルに入力値を登録
        service.insert(user);

        // signin.htmlに画面遷移
        return "/user/signin";
    }
}
