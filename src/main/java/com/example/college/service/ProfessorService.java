package com.example.college.service;

import com.example.college.entity.ClubEntity;
import com.example.college.entity.ProfessorEntity;
import com.example.college.repository.ClubRepository;
import com.example.college.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepository professorRepository;
    private final ClubRepository clubRepository;

    // 모든 교수 조회
    public List<ProfessorEntity> findAllProfessors() {
        return professorRepository.findAll();
    }

    // 특정 교수 조회
    public ProfessorEntity findProfessorById(Integer professorId) {
        return professorRepository.findById(professorId).orElseThrow();
    }

    // 교수에 의해 지도되는 동아리 조회
    public List<ClubEntity> findClubsByProfessor(Integer professorId) {
        return clubRepository.findByProfessor_ProfessorId(professorId);
    }

    // 교수 저장
    public void saveProfessor(ProfessorEntity professor) {
        professorRepository.save(professor);
    }

    // 교수 삭제
    public void deleteProfessor(Integer professorId) {
        professorRepository.deleteById(professorId);
    }
}
