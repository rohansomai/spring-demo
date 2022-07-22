package com.practice.spring.models;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String userName;
    private String status;

}
