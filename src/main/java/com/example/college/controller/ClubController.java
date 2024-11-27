package com.example.college.controller;

import com.example.college.entity.ClubEntity;
import com.example.college.service.ClubService;
import com.example.college.service.ClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clubs")
@RequiredArgsConstructor
public class ClubController {
    private final ClubService ClubService;

    @GetMapping
    public List<ClubEntity> getAllClubs() {
        return ClubService.findAllClubs();
    }

    @GetMapping("/{id}")
    public ClubEntity getClub(@PathVariable String id) {
        return ClubService.findClubById(id);
    }

    @PostMapping
    public ResponseEntity<String> createClub(@RequestBody ClubEntity Club) {
        ClubService.saveClub(Club);
        return ResponseEntity.ok("Club created");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateClub(@PathVariable int id, @RequestBody ClubEntity Club) {
        ClubService.updateClub(Club);
        return ResponseEntity.ok("Club updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClub(@PathVariable String id) {
        ClubService.deleteClub(id);
        return ResponseEntity.ok("Club deleted");
    }
}
