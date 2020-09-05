package com.example.pl.juniornot.model.entities;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id") @ToString
@Entity
@Table(name="games")
public class Game extends EntityBase{

    @Column(unique=true, nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }


}
