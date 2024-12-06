package com.example.college.controller;

import com.example.college.entity.AssistantEntity;
import com.example.college.service.AssistantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assistants")
@RequiredArgsConstructor
public class AssistantController {
    private final AssistantService assistantService;

    @GetMapping
    public ResponseEntity<List<AssistantEntity>> getAllAssistants() {
        List<AssistantEntity> assistants = assistantService.findAllAssistants();
        return ResponseEntity.ok(assistants);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AssistantEntity> getAssistantById(@PathVariable Integer id) {
        AssistantEntity assistant = assistantService.findAssistantById(id);
        return ResponseEntity.ok(assistant);
    }

    @PostMapping
    public ResponseEntity<AssistantEntity> addAssistant(@RequestBody AssistantEntity assistant) {
        assistantService.saveAssistant(assistant);
        return ResponseEntity.ok(assistant);
    }

    @PutMapping
    public ResponseEntity<AssistantEntity> updateAssistant(@RequestBody AssistantEntity assistant) {
        assistantService.updateAssistant(assistant);
        return ResponseEntity.ok(assistant);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAssistant(@PathVariable Integer id) {
        assistantService.deleteAssistant(id);
        return ResponseEntity.noContent().build();
    }
}