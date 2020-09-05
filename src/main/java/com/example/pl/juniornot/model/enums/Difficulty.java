package com.example.pl.juniornot.model.enums;

public enum Difficulty {
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private String difficulties;

    Difficulty(String difficulties) {
        this.difficulties = difficulties;
    }

    public String getDifficulties() {
        return difficulties;
    }
}
