package com.example.college.repository;

import com.example.college.entity.FeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeeRepository extends JpaRepository<FeeEntity, Integer> {
}
