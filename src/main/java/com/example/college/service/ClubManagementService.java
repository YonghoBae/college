package com.example.college.service;

import com.example.college.entity.ClubManagementEntity;
import com.example.college.entity.ClubManagementKey;
import com.example.college.repository.ClubManagementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClubManagementService {
    private final ClubManagementRepository ClubManagementRepository;

    public List<ClubManagementEntity> findAllClubManagements() {
        return ClubManagementRepository.findAll();
    }

    public ClubManagementEntity findClubManagementById(ClubManagementKey id) {
        return ClubManagementRepository.findById(id).orElseThrow();
    }

    public void saveClubManagement(ClubManagementEntity ClubManagement) {
        ClubManagementRepository.save(ClubManagement);
    }

    public void updateClubManagement(ClubManagementEntity ClubManagement) {
        ClubManagementRepository.save(ClubManagement);
    }

    public void deleteClubManagement(ClubManagementKey id) {
        ClubManagementRepository.deleteById(id);
    }
}