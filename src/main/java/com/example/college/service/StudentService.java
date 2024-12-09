package com.example.college.service;

import com.example.college.entity.ActivityEntity;
import com.example.college.entity.ActivityParticipationEntity;
import com.example.college.entity.StudentEntity;
import com.example.college.repository.ActivityParticipationRepository;
import com.example.college.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final ActivityParticipationRepository activityParticipationRepository;

    // 모든 학생 조회
    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll();
    }

    // 특정 학생 조회
    public StudentEntity findStudentById(Integer studentId) {
        return studentRepository.findById(studentId).orElseThrow();
    }

    // 학생이 참여한 활동 조회
    public List<ActivityEntity> findActivitiesByStudent(Integer studentId) {
        // 활동 참여 테이블에서 학생 ID 기준으로 활동 조회
        List<ActivityParticipationEntity> participations = activityParticipationRepository.findByStudent_StudentId(studentId);
        return participations.stream()
                .map(participation -> participation.getActivity())
                .collect(Collectors.toList());
    }

    // 학생 저장
    public void saveStudent(StudentEntity student) {
        studentRepository.save(student);
    }

    // 학생 삭제
    public void deleteStudent(Integer studentId) {
        studentRepository.deleteById(studentId);
    }
}
