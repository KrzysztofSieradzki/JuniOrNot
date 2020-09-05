package com.example.pl.juniornot.model.entities;

import com.example.pl.juniornot.model.enums.Difficulty;
import com.example.pl.juniornot.model.enums.Language;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id") @ToString
@Entity
@Table(name="questions")
public class Question extends EntityBase {
    @Column(unique=true, nullable = false)
    private String query;
    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;
    @Enumerated(EnumType.STRING)
    private Language language;
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;
    @ManyToOne
    @JoinColumn(name="game_id")
    private Game game;

    public Game getGame() { return game; }

    public void setGame(Game game) { this.game = game; }

    public String getQuery() { return query; }

    public void setQuery(String query) { this.query = query; }

    public Difficulty getDifficulty() { return difficulty; }

    public void setDifficulty(Difficulty difficulty) { this.difficulty = difficulty; }

    public Language getLanguage() { return language; }

    public void setLanguage(Language language) { this.language = language; }

    public List<Answer> getAnswers() { return answers; }

    public void setAnswers(List<Answer> answers) { this.answers = answers; }
}
