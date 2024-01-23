package com.students.students.service;

import com.students.students.repository.StudentRepository;
import com.students.students.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;
    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> findAllStudentsBySchool(Integer schoolId){
        return studentRepository.findBySchoolId(schoolId);
    }
}
