package com.example.PayMyBuddy.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Account {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer accountId;

    private Double balance;
    private String IBAN;


}
