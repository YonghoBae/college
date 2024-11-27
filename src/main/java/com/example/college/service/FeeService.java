package com.example.college.service;

import com.example.college.entity.FeeEntity;
import com.example.college.repository.FeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FeeService {
    private final FeeRepository feeRepository;

    public List<FeeEntity> findAllFees() {
        return feeRepository.findAll();
    }

    public FeeEntity findFeeById(Integer id) {
        return feeRepository.findById(id).orElseThrow();
    }

    public void saveFee(FeeEntity fee) {
        feeRepository.save(fee);
    }

    public void updateFee(FeeEntity fee) {
        feeRepository.save(fee);
    }

    public void deleteFee(Integer id) {
        feeRepository.deleteById(id);
    }
}
