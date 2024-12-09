package com.example.college.controller;

import com.example.college.entity.StudentEntity;
import com.example.college.entity.ActivityEntity;
import com.example.college.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    // 모든 학생 조회
    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.findAllStudents();
    }

    // 특정 학생 조회
    @GetMapping("/{studentId}")
    public StudentEntity getStudent(@PathVariable Integer studentId) {
        return studentService.findStudentById(studentId);
    }

    // 학생 생성
    @PostMapping
    public StudentEntity createStudent(@RequestBody StudentEntity student) {
        studentService.saveStudent(student);
        return student;
    }

    // 학생 삭제
    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable Integer studentId) {
        studentService.deleteStudent(studentId);
    }

    // 학생이 참여한 활동 조회
    @GetMapping("/{studentId}/activities")
    public List<ActivityEntity> getActivitiesByStudent(@PathVariable Integer studentId) {
        return studentService.findActivitiesByStudent(studentId);
    }
}
