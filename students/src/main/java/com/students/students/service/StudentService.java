package com.students.students.service;

import com.students.students.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    public void saveStudent(Student student);
    public List<Student> findAllStudents();

    public List<Student> findAllStudentsBySchool(Integer schoolId);

}
