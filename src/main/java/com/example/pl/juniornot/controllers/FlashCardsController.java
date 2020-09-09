package com.example.pl.juniornot.controllers;

import com.example.pl.juniornot.dto.QuestionDTO;
import com.example.pl.juniornot.model.enums.Difficulty;
import com.example.pl.juniornot.model.enums.Language;
import com.example.pl.juniornot.service.FlashCardsService;
import com.example.pl.juniornot.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/flash_cards")
public class FlashCardsController {

    private final FlashCardsService flashCardsService;
    private final QuestionService questionService;

    @Autowired
    public FlashCardsController(FlashCardsService flashCardsService, QuestionService questionService) {
        this.flashCardsService = flashCardsService;
        this.questionService = questionService;
    }

    @ModelAttribute(name="languages")
    public List<Language> languages(){return new ArrayList<>(Arrays.asList(Language.values())); }

    @ModelAttribute(name="difficulties")
    public List<Difficulty> difficulties(){return new ArrayList<>(Arrays.asList(Difficulty.values())); }

    @GetMapping
    public String getFlashCardsGame(){
        return "flash-cards";
    }

    @PostMapping("/settings")
    public String startAGame(Language language, Difficulty difficulty, Model model){
        List<QuestionDTO> chosenQuestions = questionService.allQuestionsWithChoosenSetting(language,difficulty);
        Collections.shuffle(chosenQuestions);
        if(!chosenQuestions.isEmpty()) {model.addAttribute("questions",chosenQuestions);}
        Integer startNo = 0;
        model.addAttribute("no",startNo);
        return  "flash-cards_gameboard";
    }

    @GetMapping("/answer")
    public String game(Integer no){
        return "flash_cards"; // TO DO something else
    }

}
