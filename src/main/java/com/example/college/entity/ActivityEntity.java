package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "activity")
@Getter
@Setter
@NoArgsConstructor
public class ActivityEntity {

    @Id
    @Column(name = "activity_name")
    private String activityName;

    @Column(name = "activity_date")
    private String activityDate;

    @Column(name = "type")
    private String type;

    @Column(name = "expense")
    private Double expense;

    @ManyToOne
    @JoinColumn(name = "club_name", referencedColumnName = "club_name")
    private ClubEntity club;
}