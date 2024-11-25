package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Announcement")
@Getter
@Setter
@NoArgsConstructor
public class AnnouncementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "announcement_id")
    private Integer announcementId; // Primary Key

    @Column(name = "activity_name")
    private String activityName; // Foreign Key

    @Column(name = "club_name")
    private String clubName; // Foreign Key

    @Column(name = "content")
    private String content;
}
