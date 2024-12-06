package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ActivityReport")
@Getter
@Setter
@NoArgsConstructor
public class ActivityReportEntity {
    @Id
    @Column(name = "report_id")
    private Integer reportId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "written_date")
    private String writtenDate;
}
