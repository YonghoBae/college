package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "clubmanagement")
@Getter
@Setter
@NoArgsConstructor
public class ClubManagementEntity {
    @EmbeddedId
    private ClubManagementKey id;

    @Column(name = "role")
    private String role;

    @Column(name = "start_date")
    private LocalDate startDate; // 변경된 부분

    @MapsId("clubName")
    @ManyToOne
    @JoinColumn(name = "club_name")
    private ClubEntity club;

    @MapsId("studentId")
    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;
}
