package com.example.pl.juniornot.controllers;

import com.example.pl.juniornot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomePageController {

    private final UserService userService;

    @Autowired
    public HomePageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getHomePager(){
        return "home-page";
    }

}
