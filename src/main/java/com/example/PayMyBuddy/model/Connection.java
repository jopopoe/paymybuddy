package com.example.PayMyBuddy.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Connection {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer accountId;
    @ManyToOne
    private User user1;
    @ManyToOne
    private User user2;




}
