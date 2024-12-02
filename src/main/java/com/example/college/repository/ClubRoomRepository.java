package com.example.college.repository;

import com.example.college.entity.ClubRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRoomRepository extends JpaRepository<ClubRoomEntity, String> {
}