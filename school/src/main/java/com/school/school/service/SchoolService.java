package com.school.school.service;

import com.school.school.entity.FullSchoolResponse;
import com.school.school.entity.School;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolService {
    public void saveSchool(School school);
    public List<School> findAllSchools();
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId);
}
