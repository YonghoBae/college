package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Budget")
@Getter
@Setter
@NoArgsConstructor
public class BudgetEntity {
    @Id
    @Column(name = "budget_id")
    private Integer budgetId;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "type")
    private String type;

    @Column(name = "created_date")
    private String createdDate;

    @ManyToOne
    @JoinColumn(name = "club_name")
    private ClubEntity club;
}
