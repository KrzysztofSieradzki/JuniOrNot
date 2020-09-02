package com.example.pl.juniornot.service;

import com.example.pl.juniornot.model.repositories.GameRepositories;
import com.example.pl.juniornot.model.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlashCardsService {

    private final UserRepositories userRepositories;
    private final GameRepositories gameRepositories;

    @Autowired
    public FlashCardsService(UserRepositories userRepositories, GameRepositories gameRepositories) {
        this.userRepositories = userRepositories;
        this.gameRepositories = gameRepositories;
    }


}
