package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Club")
@Getter
@Setter
@NoArgsConstructor
public class ClubEntity {
    @Id
    @Column(name = "club_name")
    private String clubName; // Primary Key

    @Column(name = "safety_status")
    private String safetyStatus;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private ProfessorEntity professor;

    @ManyToOne
    @JoinColumn(name = "assistant_id")
    private AssistantEntity assistant;
}
