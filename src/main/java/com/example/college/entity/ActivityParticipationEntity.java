package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "ActivityParticipation")
@Getter
@Setter
@NoArgsConstructor
public class ActivityParticipationEntity {
    @EmbeddedId
    private ActivityParticipationKey id;

    @MapsId("activityName")
    @ManyToOne
    @JoinColumn(name = "activity_name")
    private ActivityEntity activity;

    @MapsId("studentId")
    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;
}