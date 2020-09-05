package com.example.pl.juniornot.model.repositories;

import com.example.pl.juniornot.model.entities.Question;
import com.example.pl.juniornot.model.enums.Difficulty;
import com.example.pl.juniornot.model.enums.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Level;

@Repository
public interface QuestionRepositories extends JpaRepository<Question,Long> {

    @Query(value="SELECT q FROM Game g JOIN g.questions q WHERE q.language=?1 AND q.difficulty=?2")
    List<Question> findAllQuestionWithSpecificSettings(Language language, Difficulty difficulty);
}
