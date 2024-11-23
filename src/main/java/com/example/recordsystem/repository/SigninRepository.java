package com.example.recordsystem.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SigninRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findById(String id) {

        // SELECT文
        String query = "SELECT" + " * " + "FROM user" + " " + "WHERE id=?";

        // 検索実行
        Map<String, Object> user = jdbcTemplate.queryForMap(query);

        return user;
    }
}
