package com.example.college.controller;

import com.example.college.entity.FeeEntity;
import com.example.college.service.FeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fees")
@RequiredArgsConstructor
public class FeeController {
    private final FeeService feeService;

    @GetMapping
    public List<FeeEntity> getAllFees() {
        return feeService.findAllFees();
    }

    @GetMapping("/{id}")
    public FeeEntity getFee(@PathVariable int id) {
        return feeService.findFeeById(id);
    }

    @PostMapping
    public ResponseEntity<String> createFee(@RequestBody FeeEntity fee) {
        feeService.saveFee(fee);
        return ResponseEntity.ok("Fee created");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateFee(@PathVariable int id, @RequestBody FeeEntity fee) {
        feeService.updateFee(fee);
        return ResponseEntity.ok("Fee updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFee(@PathVariable int id) {
        feeService.deleteFee(id);
        return ResponseEntity.ok("Fee deleted");
    }
}
