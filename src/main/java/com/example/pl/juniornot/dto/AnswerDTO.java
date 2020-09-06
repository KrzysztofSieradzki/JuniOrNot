package com.example.pl.juniornot.dto;

import com.example.pl.juniornot.model.entities.Question;
import lombok.Data;

@Data
public class AnswerDTO {

    private String contents;
    private boolean correctness;
    private Question question;

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public boolean isCorrectness() {
        return correctness;
    }

    public void setCorrectness(boolean correctness) {
        this.correctness = correctness;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
