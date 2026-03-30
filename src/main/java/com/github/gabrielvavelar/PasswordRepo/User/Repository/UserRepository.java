package com.github.gabrielvavelar.PasswordRepo.User.Repository;

import com.github.gabrielvavelar.PasswordRepo.User.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    boolean existsByEmail(String email);
}
