package com.example.college.repository;

import com.example.college.entity.ActivityReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityReportRepository extends JpaRepository<ActivityReportEntity, Integer> {

    // 활동 이름을 기준으로 모든 보고서 조회
    List<ActivityReportEntity> findByActivityActivityName(String activityName);
}
