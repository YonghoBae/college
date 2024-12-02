package com.example.college.repository;

import com.example.college.entity.ActivityParticipationEntity;
import com.example.college.entity.ActivityParticipationKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityParticipationRepository extends JpaRepository<ActivityParticipationEntity, ActivityParticipationKey> {
}