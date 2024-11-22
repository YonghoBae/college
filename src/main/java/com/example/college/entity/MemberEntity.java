package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Member")
@Getter
@Setter
@NoArgsConstructor
public class MemberEntity {
    @Id
    @Column(name = "member_id")
    private Integer memberId; // Primary Key

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "contact")
    private String contact;

    @Column(name = "role")
    private String role;

    @Column(name = "fee_status")
    private Boolean feeStatus;
}