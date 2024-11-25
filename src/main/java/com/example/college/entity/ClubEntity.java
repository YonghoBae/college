package com.example.college.entity;

import jakarta.persistence.*;
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

    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "building_no")
    private String buildingNo;

    @Column(name = "safety_status")
    private Boolean safetyStatus;
}
