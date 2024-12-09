package com.example.college.repository;

import com.example.college.entity.ActivityParticipationEntity;
import com.example.college.entity.ActivityParticipationKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityParticipationRepository extends JpaRepository<ActivityParticipationEntity, ActivityParticipationKey> {

    // 활동 이름을 기준으로 참여자 조회
    List<ActivityParticipationEntity> findByActivity_ActivityName(String activityName);

    // 학생 ID를 기준으로 참여한 모든 활동 조회
    List<ActivityParticipationEntity> findByStudent_StudentId(Integer studentId);

    // 활동 이름과 학생 ID를 기준으로 데이터 조회 (복합키 기준)
    List<ActivityParticipationEntity> findByActivity_ActivityNameAndStudent_StudentId(String activityName, Integer studentId);
}
