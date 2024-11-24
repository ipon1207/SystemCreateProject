package com.example.recordsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recordsystem.model.User;

public interface SignupRepository extends JpaRepository<User, Integer>{
    
}
