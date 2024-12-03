package com.example.college.service;

import com.example.college.entity.ClubRoomEntity;
import com.example.college.repository.ClubRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClubRoomService {
    private final ClubRoomRepository ClubRoomRepository;

    public List<ClubRoomEntity> findAllClubRooms() {
        return ClubRoomRepository.findAll();
    }

    public ClubRoomEntity findClubRoomById(String id) {
        return ClubRoomRepository.findById(id).orElseThrow();
    }

    public void saveClubRoom(ClubRoomEntity ClubRoom) {
        ClubRoomRepository.save(ClubRoom);
    }

    public void updateClubRoom(ClubRoomEntity ClubRoom) {
        ClubRoomRepository.save(ClubRoom);
    }

    public void deleteClubRoom(String id) {
        ClubRoomRepository.deleteById(id);
    }
}
