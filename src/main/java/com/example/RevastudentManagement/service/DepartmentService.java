package com.example.RevastudentManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RevastudentManagement.entity.Department;
import com.example.RevastudentManagement.repository.DepartmentRepo;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepo repo;

    public Department addDepartment(Department department) {
        return repo.save(department);
    }

    public List<Department> getAllDepartments() {
        return repo.findAll();
    }

    public void deleteDepartment(Long id) {
        repo.deleteById(id);
    }
}
