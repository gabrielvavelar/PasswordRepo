package com.github.gabrielvavelar.PasswordRepo.Auth.Controler;

import com.github.gabrielvavelar.PasswordRepo.Auth.Service.AuthService;
import com.github.gabrielvavelar.PasswordRepo.Auth.dto.RegisterRequestDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
public class AuthController {

    final private AuthService authService;

    @PostMapping("register")
    void register(@RequestBody @Valid RegisterRequestDto registerRequestDto) {
        authService.registerUser(registerRequestDto);
    }

}
