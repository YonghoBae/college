package com.example.college.controller;

import com.example.college.entity.ActivityEntity;
import com.example.college.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activities")
@RequiredArgsConstructor
public class ActivityController {

    private final ActivityService activityService;

    // 모든 활동 조회
    @GetMapping
    public List<ActivityEntity> getAllActivities() {
        return activityService.findAllActivities();
    }

    // 특정 활동 조회
    @GetMapping("/{activityName}")
    public ActivityEntity getActivity(@PathVariable String activityName) {
        return activityService.findActivityById(activityName);
    }

    // 활동 생성
    @PostMapping
    public ActivityEntity createActivity(@RequestBody ActivityEntity activity) {
        activityService.saveActivity(activity);
        return activity;
    }

    // 활동 삭제
    @DeleteMapping("/{activityName}")
    public void deleteActivity(@PathVariable String activityName) {
        activityService.deleteActivity(activityName);
    }
}
