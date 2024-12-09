package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "notice")
@Getter
@Setter
@NoArgsConstructor
public class NoticeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notice_id")
    private Integer noticeId;

    @Column(name = "content")
    private String content;

    @Column(name = "written_date")
    private String writtenDate;

    @ManyToOne
    @JoinColumn(name = "club_name", referencedColumnName = "club_name")
    private ClubEntity club;
}