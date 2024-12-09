package com.example.college.service;

import com.example.college.entity.ActivityEntity;
import com.example.college.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityRepository activityRepository;

    // 모든 활동 조회
    public List<ActivityEntity> findAllActivities() {
        return activityRepository.findAll();
    }

    // 활동 이름으로 특정 활동 조회
    public ActivityEntity findActivityById(String activityName) {
        return activityRepository.findById(activityName).orElseThrow();
    }

    // 활동 저장
    public void saveActivity(ActivityEntity activity) {
        activityRepository.save(activity);
    }

    // 활동 삭제
    public void deleteActivity(String activityName) {
        activityRepository.deleteById(activityName);
    }
}
