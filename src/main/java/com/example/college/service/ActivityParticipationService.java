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
    private final ActivityParticipationRepository ActivityParticipationRepository;

    public List<ActivityParticipationEntity> findAllActivityParticipations() {
        return ActivityParticipationRepository.findAll();
    }

    public ActivityParticipationEntity findActivityParticipationById(ActivityParticipationKey id) {
        return ActivityParticipationRepository.findById(id).orElseThrow();
    }

    public void saveActivityParticipation(ActivityParticipationEntity ActivityParticipation) {
        ActivityParticipationRepository.save(ActivityParticipation);
    }

    public void updateActivityParticipation(ActivityParticipationEntity ActivityParticipation) {
        ActivityParticipationRepository.save(ActivityParticipation);
    }

    public void deleteActivityParticipation(ActivityParticipationKey id) {
        ActivityParticipationRepository.deleteById(id);
    }
}