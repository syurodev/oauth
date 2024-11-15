package com.zen.oauth.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(
        name = "user_devices",
        indexes = {
                @Index(name = "idx_user_device", columnList = "user_id, device_id")
        }
)
@Data
public class UserDevice extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "device_id", nullable = false)
    private Long deviceId;
}
