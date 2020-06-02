package com.example.pl.juniornot.model.repositories;

import com.example.pl.juniornot.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User,Long> {


}
