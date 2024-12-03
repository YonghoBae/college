package com.example.college.service;

import com.example.college.entity.BudgetEntity;
import com.example.college.repository.BudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BudgetService {
    private final BudgetRepository BudgetRepository;

    public List<BudgetEntity> findAllBudgets() {
        return BudgetRepository.findAll();
    }

    public BudgetEntity findBudgetById(Integer id) {
        return BudgetRepository.findById(id).orElseThrow();
    }

    public void saveBudget(BudgetEntity Budget) {
        BudgetRepository.save(Budget);
    }

    public void updateBudget(BudgetEntity Budget) {
        BudgetRepository.save(Budget);
    }

    public void deleteBudget(Integer id) {
        BudgetRepository.deleteById(id);
    }
}
