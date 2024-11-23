package com.example.recordsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.recordsystem.repository.User;
import com.example.recordsystem.service.SigninService;

@Controller
public class SigninController {
    
    @Autowired
    private SigninService service;

    @GetMapping("/user/signin")
    public String getSignin() {
        // signin.htmlに画面遷移
        return "signin";
    }

    @PostMapping("/user/db")
    public String postUserDb(@RequestParam("userid") String id, Model model) {

        // 1件検索
        User user = service.getUser(id);

        // 検索結果をModelに登録
        model.addAttribute("user", user);

        // db.htmlに画面遷移
        return "/user/db";
    }
}
