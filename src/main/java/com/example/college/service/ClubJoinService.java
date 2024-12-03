package com.example.college.service;

import com.example.college.entity.ClubJoinEntity;
import com.example.college.entity.ClubJoinKey;
import com.example.college.repository.ClubJoinRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClubJoinService {
    private final ClubJoinRepository ClubJoinRepository;

    public List<ClubJoinEntity> findAllClubJoins() {
        return ClubJoinRepository.findAll();
    }

    public ClubJoinEntity findClubJoinById(ClubJoinKey id) {
        return ClubJoinRepository.findById(id).orElseThrow();
    }

    public void saveClubJoin(ClubJoinEntity ClubJoin) {
        ClubJoinRepository.save(ClubJoin);
    }

    public void updateClubJoin(ClubJoinEntity ClubJoin) {
        ClubJoinRepository.save(ClubJoin);
    }

    public void deleteClubJoin(ClubJoinKey id) {
        ClubJoinRepository.deleteById(id);
    }
}
