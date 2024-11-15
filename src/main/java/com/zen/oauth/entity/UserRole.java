package com.zen.oauth.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(
    name = "user_roles",
    indexes = {
            @Index(name = "idx_user_role", columnList = "user_id, role_id")
    }
)
@Data
public class UserRole extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "role_id", nullable = false)
    private int roleId;
}
