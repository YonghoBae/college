package com.example.college.repository;

import com.example.college.entity.ClubJoinEntity;
import com.example.college.entity.ClubJoinKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClubJoinRepository extends JpaRepository<ClubJoinEntity, ClubJoinKey> {

    // 동아리 이름을 기준으로 가입한 학생들 조회
    List<ClubJoinEntity> findByClubName(String clubName);

    // 학생 ID를 기준으로 가입한 동아리 조회
    List<ClubJoinEntity> findByStudentId(Integer studentId);
}
