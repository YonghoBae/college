package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ClubRoom")
@Getter
@Setter
@NoArgsConstructor
public class ClubRoomEntity {
    @Id
    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "safety_status")
    private String safetyStatus;
}
