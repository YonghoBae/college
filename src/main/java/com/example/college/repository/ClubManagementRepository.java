package com.example.college.repository;

import com.example.college.entity.ClubManagementEntity;
import com.example.college.entity.ClubManagementKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubManagementRepository extends JpaRepository<ClubManagementEntity, ClubManagementKey> {
}