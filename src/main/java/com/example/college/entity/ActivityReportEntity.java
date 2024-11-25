package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Activity_Report")
@Getter
@Setter
@NoArgsConstructor
public class ActivityReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Integer reportId; // Primary Key

    @Column(name = "activity_id")
    private Integer activityId; // Foreign Key

    @Column(name = "submission_date")
    private String submissionDate;

    @Column(name = "activity_content")
    private String activityContent;

    @Column(name = "achievement")
    private String achievement;
}
