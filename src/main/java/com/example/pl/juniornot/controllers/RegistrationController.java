package com.example.pl.juniornot.controllers;

import com.example.pl.juniornot.dto.RegisterUserDTO;
import com.example.pl.juniornot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    private final UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getRegisterPager(){
        return "registration-page";
    }

    @PostMapping
    public String registerUser(RegisterUserDTO registerUserDTO){
        try{
            userService.saveUser(registerUserDTO);
        }catch (RuntimeException e){
            e.printStackTrace();
            return "redirect:/register";
        }

        return "login-page";
    }
}
