package com.example.college.repository;

import com.example.college.entity.ActivityEntity;
import com.example.college.entity.ActivityReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityReportEntity, String> {

    // 활동 이름을 기준으로 특정 활동 조회
    List<ActivityReportEntity> findByActivity_ActivityName(String activityName);

}
