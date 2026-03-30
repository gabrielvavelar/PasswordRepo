package com.github.gabrielvavelar.PasswordRepo.Exception.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorResponseDto(
        String message,
        HttpStatus status,
        LocalDateTime timestamp
) {
}
