package com.example.PayMyBuddy.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {

    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    @Column(unique = true)
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    @ManyToMany
    private List<Connection> connections;
    @OneToOne
    private Account account;

}
