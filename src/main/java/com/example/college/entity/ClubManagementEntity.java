package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "ClubManagement")
@Getter
@Setter
@NoArgsConstructor
public class ClubManagementEntity {
    @EmbeddedId
    private ClubManagementKey id;

    @Column(name = "role")
    private String role;

    @Column(name = "start_date")
    private String startDate;

    @MapsId("clubName")
    @ManyToOne
    @JoinColumn(name = "club_name")
    private ClubEntity club;

    @MapsId("studentId")
    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;
}

@Embeddable
class ClubManagementKey implements Serializable {
    private String clubName;
    private Integer studentId;
}
