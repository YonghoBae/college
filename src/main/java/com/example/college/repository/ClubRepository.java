package com.example.college.repository;

import com.example.college.entity.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubRepository extends JpaRepository<ClubEntity, String> {

    // 'professorId'를 사용하여 쿼리 수정
    List<ClubEntity> findByProfessor_ProfessorId(Integer professorId);
}
