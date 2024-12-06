package com.example.college.controller;

import com.example.college.entity.ClubEntity;
import com.example.college.service.ClubService;
import com.example.college.service.ClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubs")
@RequiredArgsConstructor
public class ClubController {
    private final ClubService clubService;

    @GetMapping
    public ResponseEntity<List<ClubEntity>> getAllClubs() {
        List<ClubEntity> clubs = clubService.findAllClubs();
        return ResponseEntity.ok(clubs);
    }

    @GetMapping("/{name}")
    public ResponseEntity<ClubEntity> getClubByName(@PathVariable String name) {
        ClubEntity club = clubService.findClubById(name);
        return ResponseEntity.ok(club);
    }

    @PostMapping
    public ResponseEntity<ClubEntity> addClub(@RequestBody ClubEntity club) {
        clubService.saveClub(club);
        return ResponseEntity.ok(club);
    }

    @PutMapping
    public ResponseEntity<ClubEntity> updateClub(@RequestBody ClubEntity club) {
        clubService.updateClub(club);
        return ResponseEntity.ok(club);
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<Void> deleteClub(@PathVariable String name) {
        clubService.deleteClub(name);
        return ResponseEntity.noContent().build();
    }
}

