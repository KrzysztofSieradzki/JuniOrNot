package com.example.pl.juniornot.model.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="games")
public class Game extends EntityBase{

    private String name;
    private User user;
    
}
