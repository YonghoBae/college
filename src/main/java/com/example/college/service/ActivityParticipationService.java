package com.example.college.service;

import com.example.college.entity.ActivityParticipationEntity;
import com.example.college.entity.ActivityParticipationKey;
import com.example.college.repository.ActivityParticipationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityParticipationService {

    private final ActivityParticipationRepository activityParticipationRepository;

    // 활동 이름을 기준으로 참여한 학생들 조회
    public List<ActivityParticipationEntity> findByActivityName(String activityName) {
        return activityParticipationRepository.findByActivity_ActivityName(activityName);
    }

    // 학생 ID를 기준으로 참여한 모든 활동 조회
    public List<ActivityParticipationEntity> findByStudentId(Integer studentId) {
        return activityParticipationRepository.findByStudent_StudentId(studentId);
    }

    // 활동 이름과 학생 ID를 기준으로 데이터 조회 (복합키 기준)
    public List<ActivityParticipationEntity> findByActivityNameAndStudentId(String activityName, Integer studentId) {
        return activityParticipationRepository.findByActivity_ActivityNameAndStudent_StudentId(activityName, studentId);
    }

    // 참여 데이터 저장
    public void saveActivityParticipation(ActivityParticipationEntity activityParticipation) {
        activityParticipationRepository.save(activityParticipation);
    }

    // 참여 데이터 삭제
    public void deleteActivityParticipation(ActivityParticipationKey id) {
        activityParticipationRepository.deleteById(id);
    }
}
