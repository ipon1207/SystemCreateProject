package com.example.recordsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SigninController {
    
    // signin.htmlからの入力を受け取る
    @RequestMapping("/user/signin")
    public String postSignin(@RequestParam("user_name") String user_Name, Model model) {

        // 画面から受けとった文字列をmodelに登録
        model.addAttribute("userName", user_Name);

        // main.htmlに画面遷移
        return "/user/main";
    }
}
