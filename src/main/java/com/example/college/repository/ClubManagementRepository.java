package com.example.college.repository;

import com.example.college.entity.ClubManagementEntity;
import com.example.college.entity.ClubManagementKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubManagementRepository extends JpaRepository<ClubManagementEntity, ClubManagementKey> {

    // 동아리 이름을 기준으로 관리하는 학생 조회
    List<ClubManagementEntity> findByClub_ClubName(String clubName);

    // 학생 ID를 기준으로 관리하는 동아리 조회
    List<ClubManagementEntity> findByStudent_StudentId(Integer studentId);
}
