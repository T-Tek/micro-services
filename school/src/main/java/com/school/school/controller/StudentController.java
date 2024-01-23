package com.school.school.controller;

import com.school.school.entity.FullSchoolResponse;
import com.school.school.service.SchoolService;
import com.school.school.entity.School;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/schools")
public class StudentController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school){
        schoolService.saveSchool(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> get(){
        return ResponseEntity.ok(schoolService.findAllSchools());

    }

    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findSchoolsWithStudents(@PathVariable("school-id") Integer schoolId){
        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));

    }


}
