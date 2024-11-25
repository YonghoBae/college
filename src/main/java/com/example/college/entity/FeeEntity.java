package com.example.college.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Fee")
@Getter
@Setter
@NoArgsConstructor
public class FeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fee_id")
    private Integer feeId; // Primary Key

    @Column(name = "member_id")
    private Integer memberId;

    @Column(name = "total_fee")
    private Double totalFee;

    @Column(name = "paid_amount")
    private Double paidAmount;

    @Column(name = "fee_status")
    private Boolean feeStatus;
}
