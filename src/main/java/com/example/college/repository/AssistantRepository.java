package com.example.college.repository;

import com.example.college.entity.AssistantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistantRepository extends JpaRepository<AssistantEntity, Integer> {
}