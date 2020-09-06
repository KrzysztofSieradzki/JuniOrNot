package com.example.pl.juniornot.service;

import com.example.pl.juniornot.dto.AnswerDTO;
import com.example.pl.juniornot.model.entities.Answer;
import com.example.pl.juniornot.model.repositories.AnswerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerService {

    private final AnswerRepositories answerRepositories;

    @Autowired
    public AnswerService(AnswerRepositories answerRepositories) {
        this.answerRepositories = answerRepositories;
    }

    public boolean checkCorrectnessOfAnswer(Long answerId){
        Optional<Answer> answer = answerRepositories.findById(answerId);
        return answer.get().isCorrectness();
    }

    public AnswerDTO getCorrectAnswer(Long idQuestion){
       boolean correctAnswer = true;
        AnswerDTO answerDTO=null;
        Optional<Answer> answer = answerRepositories.correctAnswer(correctAnswer,idQuestion);
        if(answer!=null){
            answerDTO.setContents(answer.get().getContents());
            answerDTO.setCorrectness(answer.get().isCorrectness());
            answerDTO.setQuestion(answer.get().getQuestion());
        }
        return answerDTO;
    }


    // findCorrectAnswerForSpecificQuestion
    //show4Answers -> one good three not
    //checkAnswer

}
