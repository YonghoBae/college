package com.example.college.service;

import com.example.college.entity.ActivityEntity;
import com.example.college.repository.ActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityService {
    private final ActivityRepository ActivityRepository;

    public List<ActivityEntity> findAllActivitys() {
        return ActivityRepository.findAll();
    }

    public ActivityEntity findActivityById(String id) {
        return ActivityRepository.findById(id).orElseThrow();
    }

    public void saveActivity(ActivityEntity Activity) {
        ActivityRepository.save(Activity);
    }

    public void updateActivity(ActivityEntity Activity) {
        ActivityRepository.save(Activity);
    }

    public void deleteActivity(String id) {
        ActivityRepository.deleteById(id);
    }
}