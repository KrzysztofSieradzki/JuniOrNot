package com.example.pl.juniornot.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

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
    @OneToMany(mappedBy = "user")
    private List<Game> games;

    public List<Game> getGames() { return games; }

    public void setGames(List<Game> games) { this.games = games; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public boolean isActive() { return active; }

    public void setActive(boolean active) { this.active = active; }
}
