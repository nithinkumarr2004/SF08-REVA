package com.example.RevastudentManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RevastudentManagement.entity.Faculty;
import com.example.RevastudentManagement.repository.FacultyRepo;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepo repo;

    public Faculty addFaculty(Faculty faculty) {
        return repo.save(faculty);
    }

    public List<Faculty> getAllFaculty() {
        return repo.findAll();
    }

    public void deleteFaculty(Long id) {
        repo.deleteById(id);
    }
}
