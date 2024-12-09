package com.example.college.service;

import com.example.college.entity.BudgetEntity;
import com.example.college.repository.BudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetRepository budgetRepository;

    // 모든 예산 조회
    public List<BudgetEntity> findAllBudgets() {
        return budgetRepository.findAll();
    }

    // 특정 예산 조회
    public BudgetEntity findBudgetById(Integer id) {
        return budgetRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Budget not found"));
    }

    // 클럽에 대한 예산 조회
    public List<BudgetEntity> findBudgetsByClub(String clubName) {
        return budgetRepository.findByClub_ClubName(clubName);
    }

    // 예산 저장
    public BudgetEntity saveBudget(BudgetEntity budget) {
        return budgetRepository.save(budget);
    }

    // 예산 수정
    public BudgetEntity updateBudget(BudgetEntity budget) {
        return budgetRepository.save(budget);
    }

    // 예산 삭제
    public void deleteBudget(Integer budgetId) {
        budgetRepository.deleteById(budgetId);
    }
}
