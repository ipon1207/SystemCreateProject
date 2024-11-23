package com.example.recordsystem.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recordsystem.repository.SigninRepository;
import com.example.recordsystem.repository.User;

@Service
public class SigninService {
    
    @Autowired
    private SigninRepository repository;

    /* ユーザーを一人取得 */
    public User getUser(String userid) {

        // 検索
        Map<String, Object> map = repository.findById(userid);

        // Mapから値を取得
        String userId = (String) map.get("id");

        // Userクラスに値をセット
        User user = new User();
        user.setUserId(userId);

        return user;
    }
}
