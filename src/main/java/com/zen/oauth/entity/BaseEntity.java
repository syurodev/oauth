package com.zen.oauth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity implements Serializable {
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at")
    @CreationTimestamp
    private Date createdAt = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_at")
    @UpdateTimestamp
    private Date updatedAt = new Date();
}
