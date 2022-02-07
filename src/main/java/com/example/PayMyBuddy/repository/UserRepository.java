package com.example.PayMyBuddy.repository;

import com.example.PayMyBuddy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
