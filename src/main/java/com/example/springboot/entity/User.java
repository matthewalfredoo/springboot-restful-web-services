package com.example.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter // create getters for all properties
@Setter // create setters for all properties
@NoArgsConstructor // create a no-argument constructor
@AllArgsConstructor // create a constructor with all properties as arguments
@Entity // mark this class as a JPA entity
@Table(name = "users") // map this class to a table named "users" in the database
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique=true, nullable = false)
    private String email;

}
