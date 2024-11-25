package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Activity")
@Getter
@Setter
@NoArgsConstructor
public class ActivityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "activity_id")
    private Integer activityId; // Primary Key

    @Column(name = "activity_name")
    private String activityName;

    @Column(name = "activity_date")
    private String activityDate;

    @Column(name = "activity_place")
    private String activityPlace;

    @Column(name = "club_name")
    private String clubName; // Foreign Key
}
