package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Participation")
@Getter
@Setter
@NoArgsConstructor
public class ParticipationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "participation_id")
    private Integer participationId; // Primary Key

    @Column(name = "member_id")
    private Integer memberId; // Foreign Key

    @Column(name = "activity_id")
    private Integer activityId; // Foreign Key
}
