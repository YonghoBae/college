package com.example.college.service;

import com.example.college.entity.MemberEntity;
import com.example.college.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private MemberRepository memberRepository;

    public List<MemberEntity> findAllMembers() {
        return memberRepository.findAll();
    }

    public MemberEntity findMemberById(Integer id) {
        return memberRepository.findById(id).orElseThrow();
    }

    public void saveMember(MemberEntity member) { memberRepository.save(member); }

    public void updateMember(MemberEntity member) { memberRepository.save(member); }

    public void deleteMember(Integer id) { memberRepository.deleteById(id); }
}