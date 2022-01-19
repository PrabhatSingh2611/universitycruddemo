package com.example.UniversityFacultyDemo.service;

import com.example.UniversityFacultyDemo.Repository.DepartmentRepository;
import com.example.UniversityFacultyDemo.Repository.GroupRepository;
import com.example.UniversityFacultyDemo.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService{


    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> findAll() {
        return null;
    }
}
