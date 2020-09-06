package com.example.pl.juniornot.controllers;

import com.example.pl.juniornot.model.enums.Difficulty;
import com.example.pl.juniornot.model.enums.Language;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/flash_cards")
public class FlashCardsController {

    @ModelAttribute(name="languages")
    public List<Language> languages(){return new ArrayList<>(Arrays.asList(Language.values())); }

    @ModelAttribute(name="difficulties")
    public List<Difficulty> difficulties(){return new ArrayList<>(Arrays.asList(Difficulty.values())); }

    @GetMapping
    public String getFlashCardsGame(){
        return "flash-cards";
    }

    @PostMapping("/settings")
    public String startAGame(Language language, Difficulty difficulty){
        //to do
        return "";
    }

}
