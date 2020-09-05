package com.example.pl.juniornot.model.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id") @ToString
@Entity
@Table(name="answers")
public class Answer extends EntityBase {
    @Column(unique=true, nullable = false)
    private String contents;
    @Column(nullable = false)
    private boolean correctness;
    @ManyToOne
    @JoinColumn(name="question_id")
    private Question question;

    public String getContents() { return contents; }

    public void setContents(String contents) { this.contents = contents; }

    public boolean isCorrectness() { return correctness; }

    public void setCorrectness(boolean correctness) { this.correctness = correctness; }

    public Question getQuestion() { return question; }

    public void setQuestion(Question question) { this.question = question; }
}
