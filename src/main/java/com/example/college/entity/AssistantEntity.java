package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "assistant")
@Getter
@Setter
@NoArgsConstructor
public class AssistantEntity {
    @Id
    @Column(name = "assistant_id")
    private Integer assistantId; // Primary Key

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "contact")
    private String contact;

    @Column(name = "room_number")
    private String roomNumber;
}
