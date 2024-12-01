package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "ClubJoin")
@Getter
@Setter
@NoArgsConstructor
public class ClubJoinEntity {
    @EmbeddedId
    private ClubJoinKey id;

    @Column(name = "join_date")
    private String joinDate;

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
class ClubJoinKey implements Serializable {
    private String clubName;
    private Integer studentId;

    // Getters, setters, equals, hashCode 구현 필요
}
