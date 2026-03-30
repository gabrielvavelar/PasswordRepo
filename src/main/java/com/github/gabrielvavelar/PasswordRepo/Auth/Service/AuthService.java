package com.github.gabrielvavelar.PasswordRepo.Auth.Service;

import com.github.gabrielvavelar.PasswordRepo.Auth.dto.RegisterRequestDto;
import com.github.gabrielvavelar.PasswordRepo.Exception.EmailAlreadyRegisteredException;
import com.github.gabrielvavelar.PasswordRepo.User.Model.User;
import com.github.gabrielvavelar.PasswordRepo.User.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void registerUser(RegisterRequestDto registerRequestDto) {

        if (userRepository.existsByEmail(registerRequestDto.email())) {
            throw new EmailAlreadyRegisteredException("This email is already registered");
        }
        userRepository.save(new User(
                registerRequestDto.email(),
                passwordEncoder.encode(registerRequestDto.password())
        ));
    }

}
