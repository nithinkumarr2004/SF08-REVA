package com.example.RevastudentManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RevastudentManagement.entity.Faculty;
import com.example.RevastudentManagement.service.FacultyService;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    private FacultyService service;

    @PostMapping("/add")
    public Faculty addFaculty(@RequestBody Faculty faculty) {
        return service.addFaculty(faculty);
    }

    @GetMapping("/getall")
    public List<Faculty> getAllFaculty() {
        return service.getAllFaculty();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFaculty(@PathVariable Long id) {
        service.deleteFaculty(id);
    }
}
