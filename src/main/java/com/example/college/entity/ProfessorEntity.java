package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Data;
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

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "contact")
    private String contact;

    @Column(name = "room_number")
    private String roomNumber;
}
