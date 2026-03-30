package com.github.gabrielvavelar.PasswordRepo.Auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record RegisterRequestDto(
        @NotBlank(message = "Email must not be empty")
        @Email(message = "Invalid email")
        String email,

        @NotBlank(message = "Password must not be empty")
        String password
) {}
