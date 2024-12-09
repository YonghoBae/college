package com.example.college.service;

import com.example.college.entity.ClubEntity;
import com.example.college.repository.ClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClubService {

    private final ClubRepository clubRepository;

    // 모든 동아리 조회
    public List<ClubEntity> findAllClubs() {
        return clubRepository.findAll();
    }

    // 동아리 이름으로 특정 동아리 조회
    public ClubEntity findClubById(String clubName) {
        return clubRepository.findById(clubName).orElseThrow();
    }

    // 동아리 저장
    public void saveClub(ClubEntity club) {
        clubRepository.save(club);
    }

    // 동아리 삭제
    public void deleteClub(String clubName) {
        clubRepository.deleteById(clubName);
    }
}
