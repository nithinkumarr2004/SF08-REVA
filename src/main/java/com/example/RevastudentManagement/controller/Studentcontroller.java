package com.example.RevastudentManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RevastudentManagement.entity.Student;
import com.example.RevastudentManagement.service.Studentservice;

@RestController
public class Studentcontroller {

    @Autowired
    private Studentservice service;

    @PostMapping("/addstudents")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping("/getstudents")
    public List<Student> getStudents() {
        return service.getAllStudents();
    }

    @DeleteMapping("/deletestudent/{id}")
    public void deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
    }
}
