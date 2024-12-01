package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Student")
@Getter
@Setter
@NoArgsConstructor
public class StudentEntity {
    @Id
    @Column(name = "student_id")
    private Integer studentId; // Primary Key

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "contact")
    private String contact;
}
