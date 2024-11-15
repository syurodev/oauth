package com.zen.oauth.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(
        name = "users",
        indexes = {
                @Index(name = "idx_user", columnList = "username, email")
        }
)
@Data
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, name = "username")
    private String username;

    @Column(nullable = false, name = "password")
    private String password;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "is_active")
    private int isActive;
}
