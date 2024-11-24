package com.example.recordsystem.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId; // フィールド名をキャメルケースに変更

    @NotNull
    @Column(name = "pass")
    private String pass; // パスワードはハッシュ化して保存することを推奨

    @NotNull
    @Column(name = "mail")
    private String mail;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "group_id")
    private Integer groupId; // フィールド名をキャメルケースに変更

    @NotNull
    @Column(name = "created_at")
    private LocalDateTime createdAt; // DateをLocalDateTimeに変更
}
