package com.example.college.entity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class ActivityParticipationKey implements Serializable {
    private String activityName;
    private Integer studentId;
}
