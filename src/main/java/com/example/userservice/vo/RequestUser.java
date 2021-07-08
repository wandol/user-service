package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than two characters")
    private String email;

    @NotNull(message = "name cannot be null")
    @Size(min = 2,  message = "name not be less than two characters")
    private String name;

    @NotNull(message = "pwd cannot be null")
    @Size(min = 8, message = "pwd not be less than 8 characters")
    private String pwd;
}
