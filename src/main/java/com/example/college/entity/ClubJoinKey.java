package com.example.college.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ClubJoinKey implements Serializable {
    private String clubName;
    private Integer studentId;
}