package com.example.pl.juniornot.dto;

import com.example.pl.juniornot.model.enums.Difficulty;
import com.example.pl.juniornot.model.enums.Language;
import lombok.Data;

@Data
public class QuestionDTO {

    private String query;
    private Difficulty difficulty;
    private Language language;
}
