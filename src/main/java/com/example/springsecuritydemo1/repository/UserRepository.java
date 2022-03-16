package com.example.springsecuritydemo1.repository;

import com.example.springsecuritydemo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByPhoneNumber(String phoneNumber);
    Optional<User> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByPhoneNumber(String phoneNumber);
}
