package com.students.students.repository;

import com.students.students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findBySchoolId(Integer schoolId);

}
