package com.example.PayMyBuddy.repository;

import com.example.PayMyBuddy.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository <Account, Integer> {
}
