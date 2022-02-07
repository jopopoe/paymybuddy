package com.example.PayMyBuddy.repository;

import com.example.PayMyBuddy.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
