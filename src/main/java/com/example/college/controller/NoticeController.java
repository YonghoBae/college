package com.example.college.controller;

import com.example.college.entity.NoticeEntity;
import com.example.college.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Notices")
@RequiredArgsConstructor
public class NoticeController {
    private final NoticeService noticeService;

    @GetMapping
    public ResponseEntity<List<NoticeEntity>> getAllNotices() {
        List<NoticeEntity> Notices = noticeService.findAllNotices();
        return ResponseEntity.ok(Notices);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NoticeEntity> getNoticeById(@PathVariable Integer id) {
        NoticeEntity Notice = noticeService.findNoticeById(id);
        return ResponseEntity.ok(Notice);
    }

    @PostMapping
    public ResponseEntity<NoticeEntity> addNotice(@RequestBody NoticeEntity Notice) {
        noticeService.saveNotice(Notice);
        return ResponseEntity.ok(Notice);
    }

    @PutMapping
    public ResponseEntity<NoticeEntity> updateNotice(@RequestBody NoticeEntity Notice) {
        noticeService.updateNotice(Notice);
        return ResponseEntity.ok(Notice);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNotice(@PathVariable Integer id) {
        noticeService.deleteNotice(id);
        return ResponseEntity.noContent().build();
    }
}
