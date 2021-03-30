package com.devsec.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsec.example.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneByEmail(String email);
}
