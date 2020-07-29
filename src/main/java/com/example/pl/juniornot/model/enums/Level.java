package com.example.pl.juniornot.model.enums;

public enum Level {
    PADAWAN(0),
    INTERN(1),
    POTENTIAL_JUNIOR(2),
    JUNIOR(3),
    HIDDEN_GEM(4);

    private Integer level;

    Level(Integer level) {
        this.level = level;
    }

    public Integer getLevel() {
        return level;
    }
}
