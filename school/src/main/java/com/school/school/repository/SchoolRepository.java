package com.school.school.repository;

import com.school.school.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}
