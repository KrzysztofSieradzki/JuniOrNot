package com.example.pl.juniornot.service;

import com.example.pl.juniornot.dto.QuestionDTO;
import com.example.pl.juniornot.model.enums.Difficulty;
import com.example.pl.juniornot.model.enums.Language;
import com.example.pl.juniornot.model.repositories.QuestionRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    private final QuestionRepositories questionRepositories;

    @Autowired
    public QuestionService(QuestionRepositories questionRepositories) {
        this.questionRepositories = questionRepositories;
    }

    public List<QuestionDTO> allQuestionsWithChoosenSetting(Language language, Difficulty difficulty){
        return questionRepositories.findAllQuestionWithSpecificSettings(language,difficulty).stream()
        .map(Question->{
            QuestionDTO questionDTO = new QuestionDTO();
            questionDTO.setQuery(Question.getQuery());
            return questionDTO;
        }).collect(Collectors.toList());
    }
}
