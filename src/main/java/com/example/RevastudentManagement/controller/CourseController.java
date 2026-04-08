package com.example.RevastudentManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RevastudentManagement.entity.Course;
import com.example.RevastudentManagement.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return service.addCourse(course);
    }

    @GetMapping("/getall")
    public List<Course> getCourses() {
        return service.getAllCourses();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable Long id) {
        service.deleteCourse(id);
    }
}
