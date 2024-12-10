package com.example.college.controller;

import com.example.college.entity.BudgetEntity;
import com.example.college.service.BudgetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budget")
@RequiredArgsConstructor
public class BudgetController {

    private final BudgetService budgetService;

    // 모든 예산 조회
    @GetMapping
    public List<BudgetEntity> getAllBudgets() {
        return budgetService.findAllBudgets();
    }

    // 특정 예산 조회
    @GetMapping("/{budgetId}")
    public BudgetEntity getBudget(@PathVariable Integer budgetId) {
        return budgetService.findBudgetById(budgetId);
    }

    // 예산 생성
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BudgetEntity createBudget(@RequestBody BudgetEntity budget) {
        budgetService.saveBudget(budget);
        return budget;
    }

    // 예산 수정
    @PutMapping("/{budgetId}")
    public BudgetEntity updateBudget(@PathVariable Integer budgetId, @RequestBody BudgetEntity budget) {
        budget.setBudgetId(budgetId); // ensure the ID matches
        budgetService.updateBudget(budget);
        return budget;
    }

    // 예산 삭제
    @DeleteMapping("/{budgetId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBudget(@PathVariable Integer budgetId) {
        budgetService.deleteBudget(budgetId);
    }
}
