package com.example.college.service;

import com.example.college.entity.NoticeEntity;
import com.example.college.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeRepository NoticeRepository;

    public List<NoticeEntity> findAllNotices() {
        return NoticeRepository.findAll();
    }

    public NoticeEntity findNoticeById(Integer id) {
        return NoticeRepository.findById(id).orElseThrow();
    }

    public void saveNotice(NoticeEntity Notice) {
        NoticeRepository.save(Notice);
    }

    public void updateNotice(NoticeEntity Notice) {
        NoticeRepository.save(Notice);
    }

    public void deleteNotice(Integer id) {
        NoticeRepository.deleteById(id);
    }
}
