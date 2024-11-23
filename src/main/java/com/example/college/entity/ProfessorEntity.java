package com.example.college.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Professor")
@Getter
@Setter
@NoArgsConstructor
public class ProfessorEntity {
    @Id
    @Column(name = "professor_id")
    private Integer professorId; // Primary Key

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
}