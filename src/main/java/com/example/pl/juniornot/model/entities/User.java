package com.example.pl.juniornot.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(of="id") @ToString(exclude = {"password"})
@Entity
@Table(name="users")
public class User extends EntityBase{

    @Column(unique=true, nullable = false)
    private String username;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private boolean active;
}
