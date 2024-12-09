package com.example.college.repository;

import com.example.college.entity.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Integer> {
    // 기본 CRUD 메서드 제공 (findById, save, delete 등)
}
