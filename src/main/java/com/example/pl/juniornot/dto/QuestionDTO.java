package com.example.pl.juniornot.dto;

import com.example.pl.juniornot.model.enums.Difficulty;
import com.example.pl.juniornot.model.enums.Language;
import lombok.Data;

@Data
public class QuestionDTO {

    private String query;
    private Difficulty difficulty;
    private Language language;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
}
