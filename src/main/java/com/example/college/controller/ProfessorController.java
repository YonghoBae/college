package com.example.college.controller;

import com.example.college.entity.ProfessorEntity;
import com.example.college.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ProfessorController {
    private final ProfessorService ProfessorService;

    @GetMapping
    public List<ProfessorEntity> getAllProfessors() { return ProfessorService.findAllProfessors(); }

    @GetMapping("/{id}")
    public ProfessorEntity getProfessor(@PathVariable int id) { return ProfessorService.findProfessorById(id); }

    @PostMapping
    public ResponseEntity<String> createProfessor(@RequestBody ProfessorEntity Professor) {
        ProfessorService.saveProfessor(Professor);
        return ResponseEntity.ok("Professor created");
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> updateProfessor(@PathVariable int id, @RequestBody ProfessorEntity Professor) {
        ProfessorService.updateProfessor(Professor);
        return ResponseEntity.ok("Professor updated");
    }

    @DeleteMapping("{/id}")
    public ResponseEntity<String> deleteProfessor(@PathVariable int id) {
        ProfessorService.deleteProfessor(id);
        return ResponseEntity.ok("Professor deleted");
    }
}
