package com.example.pl.juniornot.model.repositories;

import com.example.pl.juniornot.model.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepositories extends JpaRepository<Question,Long> {
    
}
