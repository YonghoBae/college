package com.example.college.service;

import com.example.college.entity.StudentEntity;
import com.example.college.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private StudentRepository StudentRepository;

    public List<StudentEntity> findAllStudents() {
        return StudentRepository.findAll();
    }

    public StudentEntity findStudentById(Integer id) {
        return StudentRepository.findById(id).orElseThrow();
    }

    public void saveStudent(StudentEntity Student) { StudentRepository.save(Student); }

    public void updateStudent(StudentEntity Student) { StudentRepository.save(Student); }

    public void deleteStudent(Integer id) { StudentRepository.deleteById(id); }
}