package com.example.RevastudentManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RevastudentManagement.entity.Course;
import com.example.RevastudentManagement.repository.CourseRepo;

@Service
public class CourseService {

    @Autowired
    private CourseRepo repo;

    public Course addCourse(Course course) {
        return repo.save(course);
    }

    public List<Course> getAllCourses() {
        return repo.findAll();
    }

    public void deleteCourse(Long id) {
        repo.deleteById(id);
    }
}
