package com.example.college.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ClubJoinKey implements Serializable {
    private String clubName;
    private Integer studentId;

    // Getters, setters, equals, hashCode 구현 필요
}