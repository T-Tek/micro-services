package com.school.school.service;

import com.school.school.client.StudentClient;
import com.school.school.entity.FullSchoolResponse;
import com.school.school.repository.SchoolRepository;
import com.school.school.entity.School;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;
    private final StudentClient studentClient;
    @Override
    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    @Override
    public List<School> findAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId){
        var school = schoolRepository.findById(schoolId)
                .orElse(School.builder()
                        .name("NOT_FOUND")
                        .email("NOT_FOUND")
                        .build()
                );
        var students = studentClient.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
