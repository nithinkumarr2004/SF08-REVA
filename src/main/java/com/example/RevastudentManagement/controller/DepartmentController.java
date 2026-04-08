package com.example.RevastudentManagement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RevastudentManagement.entity.Department;
import com.example.RevastudentManagement.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department) {
        return service.addDepartment(department);
    }

    @GetMapping("/getall")
    public List<Department> getDepartments() {
        return service.getAllDepartments();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(@PathVariable Long id) {
        service.deleteDepartment(id);
    }
}
