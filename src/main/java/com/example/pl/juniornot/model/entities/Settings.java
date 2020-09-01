package com.example.pl.juniornot.model.entities;

import com.example.pl.juniornot.model.enums.Difficulty;
import com.example.pl.juniornot.model.enums.Language;
import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
@Entity
public class Settings extends EntityBase {

    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name="game_id")
    private Game game;
    @Enumerated(EnumType.ORDINAL)
    private Difficulty difficulty;
    @Enumerated(EnumType.ORDINAL)
    private Language language;

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Game getGame() { return game; }

    public void setGame(Game game) { this.game = game; }

    public Difficulty getDifficulty() { return difficulty; }

    public void setDifficulty(Difficulty difficulty) { this.difficulty = difficulty; }

    public Language getLanguage() { return language; }

    public void setLanguage(Language language) { this.language = language; }
}
