package com.example.recordsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recordsystem.model.User;
import com.example.recordsystem.repository.SignupRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SignupService {
    
    @Autowired
    SignupRepository repository;

    // usersテーブルから全件を取得
    public List<User> findAll() {
        return repository.findAll();
    }

    // usersテーブルに入力値を登録
    public void insert(User user) {
        repository.save(user);
    }

}
