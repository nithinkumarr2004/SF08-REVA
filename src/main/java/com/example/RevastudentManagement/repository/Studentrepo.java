package com.example.RevastudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.RevastudentManagement.entity.Student;

public interface Studentrepo extends JpaRepository<Student, String> {
}
