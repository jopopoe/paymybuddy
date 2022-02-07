package com.example.PayMyBuddy.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Transaction {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transactionId;

    private String description;
    private Double amountBeforeFee;
    private Double amountAfterFee;
    private LocalDateTime dateTransaction;
    @ManyToOne
    private User userSending;
    @ManyToOne
    private User userReceiving;
}
