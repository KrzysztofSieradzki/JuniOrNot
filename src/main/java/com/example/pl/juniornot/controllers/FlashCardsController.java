package com.example.pl.juniornot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/flash_cards")
public class FlashCardsController {


    public String getFlashCardsGame(){
        return "flash-cards";
    }
}