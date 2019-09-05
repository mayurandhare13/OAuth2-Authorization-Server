package com.oauth2.example.springsocial.repository;

import com.oauth2.example.springsocial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String name);
}
