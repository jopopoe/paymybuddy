package com.example.PayMyBuddy.repository;

import com.example.PayMyBuddy.model.Connection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConnectionRepository extends JpaRepository <Connection, Integer> {
}
