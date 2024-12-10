package com.example.college.controller;

import com.example.college.entity.ProfessorEntity;
import com.example.college.entity.ClubEntity;
import com.example.college.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService professorService;

    // 모든 교수 조회
    @GetMapping
    public List<ProfessorEntity> getAllProfessors() {
        return professorService.findAllProfessors();
    }

    // 특정 교수 조회
    @GetMapping("/{professorId}")
    public ProfessorEntity getProfessor(@PathVariable Integer professorId) {
        return professorService.findProfessorById(professorId);
    }

    // 교수 생성
    @PostMapping
    public ProfessorEntity createProfessor(@RequestBody ProfessorEntity professor) {
        professorService.saveProfessor(professor);
        return professor;
    }

    // 교수 삭제
    @DeleteMapping("/{professorId}")
    public void deleteProfessor(@PathVariable Integer professorId) {
        professorService.deleteProfessor(professorId);
    }

    // 교수와 연결된 동아리 조회
    @GetMapping("/{professorId}/clubs")
    public List<ClubEntity> getClubsByProfessor(@PathVariable Integer professorId) {
        return professorService.findClubsByProfessor(professorId);
    }
}
