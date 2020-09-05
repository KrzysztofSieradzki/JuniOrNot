package com.example.pl.juniornot.model.enums;

public enum Language {
    SQL("SQL"),
    Java("Java");

    private String languages;

    Language(String languages) {
        this.languages = languages;
    }

    public String getLanguages() {
        return languages;
    }
}
