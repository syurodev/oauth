package com.zen.oauth.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "devices")
@Data
public class Device extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "device_id")
    private String deviceId;

    @Column(nullable = false, name = "device_name")
    private String deviceName;

    @Column(nullable = false, name = "last_login_at")
    private Date lastLoginAt;
}
