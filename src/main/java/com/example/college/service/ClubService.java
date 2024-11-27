package com.example.college.service;

import com.example.college.entity.ClubEntity;
import com.example.college.repository.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClubService {
    private final ClubRepository ClubRepository;

    public List<ClubEntity> findAllClubs() {
        return ClubRepository.findAll();
    }

    public ClubEntity findClubById(String id) {
        return ClubRepository.findById(id).orElseThrow();
    }

    public void saveClub(ClubEntity Club) {
        ClubRepository.save(Club);
    }

    public void updateClub(ClubEntity Club) {
        ClubRepository.save(Club);
    }

    public void deleteClub(String id) {
        ClubRepository.deleteById(id);
    }
}
