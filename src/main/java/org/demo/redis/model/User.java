package org.demo.redis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "app_users")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    private String username;
}
