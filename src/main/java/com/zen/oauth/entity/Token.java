package com.zen.oauth.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "tokens",
        indexes = {
                @Index(name = "idx_token", columnList = "user_id, device_id, token")
        }
)
@Data
public class Token extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "user_id")
    private Long userId;

    @Column(nullable = false, name = "device_id")
    private Long deviceId;

    @Column(nullable = false, unique = true)
    private String token;

    @Column(nullable = false, name = "expires_at")
    private LocalDateTime expiresAt;
}
