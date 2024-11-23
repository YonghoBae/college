package com.example.college.repository;

import com.example.college.entity.ManagementEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagementRepository extends JpaRepository<ManagementEntity, Integer> {
}