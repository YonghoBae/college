package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Professor")
@Getter
@Setter
@NoArgsConstructor
public class ManagementEntity {
    @Id
    @Column(name = "management_id")
    private Integer managementId; // Primary Key

    @Column(name = "club_name")
    private String clubName;


    @ManyToOne
    @JoinColumn(name = "professor_id", referencedColumnName = "professorId")
    private Professor professor; // Foreign Key: Professor
}