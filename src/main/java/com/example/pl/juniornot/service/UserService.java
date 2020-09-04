package com.example.pl.juniornot.service;

import com.example.pl.juniornot.dto.LoggedUserDTO;
import com.example.pl.juniornot.dto.RegisterUserDTO;
import com.example.pl.juniornot.model.entities.User;
import com.example.pl.juniornot.model.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepositories userRepositories;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepositories userRepositories, PasswordEncoder passwordEncoder) {
        this.userRepositories = userRepositories;
        this.passwordEncoder = passwordEncoder;
    }

    public void saveUser(RegisterUserDTO registerUserDTO){

        String encodedPassword = passwordEncoder.encode(registerUserDTO.getPassword());

        User user = new User();
        user.setActive(true);
        user.setEmail(registerUserDTO.getEmail());
        user.setFirstName(registerUserDTO.getFirstName());
        user.setLastName(registerUserDTO.getLastName());
        user.setPassword(encodedPassword);
        user.setUsername(registerUserDTO.getUsername());

        userRepositories.save(user);
    }

//    public LoggedUserDTO getUser(String username){
//
//        LoggedUserDTO loggedUserDTO = null;
//        Optional<User> user = userRepositories.findBy
//    }
}
