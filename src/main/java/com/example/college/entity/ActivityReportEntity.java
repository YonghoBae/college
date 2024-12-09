package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "activityreport")
@Getter
@Setter
@NoArgsConstructor
public class ActivityReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Integer reportId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "written_date")
    private String writtenDate;

    @ManyToOne
    @JoinColumn(name = "activity_name", referencedColumnName = "activity_name")
    private ActivityEntity activity;

}
