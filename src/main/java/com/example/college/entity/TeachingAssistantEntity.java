package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Teaching_Assistant")
@Getter
@Setter
@NoArgsConstructor
public class TeachingAssistantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "assistant_id")
    private Integer assistantId; // Primary Key

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
}
