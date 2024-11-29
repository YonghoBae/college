package com.example.college.service;

import com.example.college.entity.ManagementEntity;
import com.example.college.repository.ManagementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManagementService {
    private ManagementRepository ManagementRepository;

    public List<ManagementEntity> findAllManagements() {
        return ManagementRepository.findAll();
    }

    public ManagementEntity findManagementById(Integer id) {
        return ManagementRepository.findById(id).orElseThrow();
    }

    public void saveManagement(ManagementEntity Management) { ManagementRepository.save(Management); }

    public void updateManagement(ManagementEntity Management) { ManagementRepository.save(Management); }

    public void deleteManagement(Integer id) { ManagementRepository.deleteById(id); }
}