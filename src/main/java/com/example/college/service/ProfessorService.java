package com.example.college.service;

import com.example.college.entity.ProfessorEntity;
import com.example.college.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorService {
    private ProfessorRepository ProfessorRepository;

    public List<ProfessorEntity> findAllProfessors() {
        return ProfessorRepository.findAll();
    }

    public ProfessorEntity findProfessorById(Integer id) {
        return ProfessorRepository.findById(id).orElseThrow();
    }

    public void saveProfessor(ProfessorEntity Professor) { ProfessorRepository.save(Professor); }

    public void updateProfessor(ProfessorEntity Professor) { ProfessorRepository.save(Professor); }

    public void deleteProfessor(Integer id) { ProfessorRepository.deleteById(id); }
}