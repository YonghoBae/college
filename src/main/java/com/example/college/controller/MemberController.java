package com.example.college.controller;

import com.example.college.entity.MemberEntity;
import com.example.college.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping
    public List<MemberEntity> getAllMembers() { return memberService.findAllMembers(); }

    @GetMapping("/{id}")
    public MemberEntity getMember(@PathVariable int id) { return memberService.findMemberById(id); }

    @PostMapping
    public ResponseEntity<String> createMember(@RequestBody MemberEntity member) {
        memberService.saveMember(member);
        return ResponseEntity.ok("Member created");
    }

    @PostMapping("/{id}")
    public ResponseEntity<String> updateMember(@PathVariable int id, @RequestBody MemberEntity member) {
        memberService.updateMember(member);
        return ResponseEntity.ok("Member updated");
    }

    public ResponseEntity<String> deleteMember(@PathVariable int id) {
        memberService.deleteMember(id);
        return ResponseEntity.ok("Member deleted");
    }
}
