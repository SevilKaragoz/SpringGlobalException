package com.ylmz.exception.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRequest {

    @NotBlank(message = "Cannot be empty !")
    private String name;

    @Email(message = "Please enter a valid email !")
    private String email;
}
