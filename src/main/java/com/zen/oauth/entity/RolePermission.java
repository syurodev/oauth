package com.zen.oauth.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(
        name = "role_permissions",
        indexes = {
                @Index(name = "idx_role_permission", columnList = "role_id, permission_id")
        }
)
@Data
public class RolePermission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role_id", nullable = false)
    private int roleId;

    @Column(name = "permission_id", nullable = false)
    private int permissionId;
}
