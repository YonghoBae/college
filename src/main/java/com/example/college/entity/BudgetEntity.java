package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "budget")
@Getter
@Setter
@NoArgsConstructor
public class BudgetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budget_id")
    private Integer budgetId;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "type")
    private String type;

    @Column(name = "created_date")
    private String createdDate;

    @ManyToOne
    @JoinColumn(name = "club_name", referencedColumnName = "club_name") // 정확한 매핑 설정
    private ClubEntity club;
}
