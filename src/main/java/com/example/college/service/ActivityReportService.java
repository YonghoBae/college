package com.example.college.service;

import com.example.college.entity.ActivityReportEntity;
import com.example.college.repository.ActivityReportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityReportService {

    private final ActivityReportRepository activityReportRepository;

    // 활동 이름을 기준으로 보고서 조회
    public List<ActivityReportEntity> findReportsByActivity(String activityName) {
        return activityReportRepository.findByActivityActivityName(activityName);
    }

    // 보고서 저장
    public void saveActivityReport(ActivityReportEntity activityReport) {
        activityReportRepository.save(activityReport);
    }

    // 보고서 삭제
    public void deleteActivityReport(Integer reportId) {
        activityReportRepository.deleteById(reportId);
    }
}
