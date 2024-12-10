package com.example.college.repository;

import com.example.college.entity.NoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository<NoticeEntity, String> {

    // 동아리 이름을 기준으로 모든 공지사항 조회
    List<NoticeEntity> findByClub_ClubName(String clubName);

}
