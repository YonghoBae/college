package com.example.college.repository;

import com.example.college.entity.ClubJoinEntity;
import com.example.college.entity.ClubJoinKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubJoinRepository extends JpaRepository<ClubJoinEntity, ClubJoinKey> {
}
