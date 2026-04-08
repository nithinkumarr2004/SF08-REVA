package com.example.RevastudentManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RevastudentManagement.entity.Student;
import com.example.RevastudentManagement.repository.Studentrepo;

@Service
public class Studentservice {

    @Autowired
    private Studentrepo repo;

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public void deleteStudent(String id) {
        repo.deleteById(id);
    }
}
