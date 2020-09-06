package com.example.pl.juniornot.model.repositories;

import com.example.pl.juniornot.model.entities.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnswerRepositories extends JpaRepository<Answer,Long> {

    @Query(value = "SELECT a FROM Question q JOIN q.answers a WHERE a.correctness=?1 and q.id=?2")
    Optional<Answer> correctAnswer(Boolean correctness, Long id);
}
