package com.example.RevastudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.RevastudentManagement.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
}
