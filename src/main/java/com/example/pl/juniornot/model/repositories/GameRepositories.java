package com.example.pl.juniornot.model.repositories;


import com.example.pl.juniornot.model.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepositories extends JpaRepository<Game, Long> {

}
