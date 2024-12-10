package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "clubjoin")
@Getter
@Setter
@NoArgsConstructor
public class ClubJoinEntity {

    @EmbeddedId
    private ClubJoinKey id;

    @MapsId("clubName")
    @ManyToOne
    @JoinColumn(name = "club_name")
    private ClubEntity club;

    @MapsId("studentId")
    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @Column(name = "join_date")
    private String joinDate;
}
