package com.example.college.controller;

import com.example.college.entity.ProfessorEntity;
import com.example.college.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professors")
@RequiredArgsConstructor
public class ProfessorController {
    private final ProfessorService professorService;

    @GetMapping
    public ResponseEntity<List<ProfessorEntity>> getAllProfessors() {
        List<ProfessorEntity> professors = professorService.findAllProfessors();
        return ResponseEntity.ok(professors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfessorEntity> getProfessorById(@PathVariable Integer id) {
        ProfessorEntity professor = professorService.findProfessorById(id);
        return ResponseEntity.ok(professor);
    }

    @PostMapping
    public ResponseEntity<ProfessorEntity> addProfessor(@RequestBody ProfessorEntity professor) {
        professorService.saveProfessor(professor);
        return ResponseEntity.ok(professor);
    }

    @PutMapping
    public ResponseEntity<ProfessorEntity> updateProfessor(@RequestBody ProfessorEntity professor) {
        professorService.updateProfessor(professor);
        return ResponseEntity.ok(professor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfessor(@PathVariable Integer id) {
        professorService.deleteProfessor(id);
        return ResponseEntity.noContent().build();
    }
}