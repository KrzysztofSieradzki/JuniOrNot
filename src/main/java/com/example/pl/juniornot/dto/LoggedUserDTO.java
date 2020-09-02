package com.example.pl.juniornot.dto;

import lombok.Data;

@Data
public class LoggedUserDTO {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
