package com.example.college.repository;

import com.example.college.entity.BudgetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetRepository extends JpaRepository<BudgetEntity, Integer> {

    // 클럽 이름을 기준으로 예산 조회
    List<BudgetEntity> findByClub_ClubName(String clubName);
}
