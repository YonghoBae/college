package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Management_Member")
@Getter
@Setter
@NoArgsConstructor
public class ManagementMemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "management_id")
    private Integer managementId; // Primary Key

    @Column(name = "club_name")
    private String clubName; // Foreign Key

    @Column(name = "member_id")
    private Integer memberId; // Foreign Key
}
