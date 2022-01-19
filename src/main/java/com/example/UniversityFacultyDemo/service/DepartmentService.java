package com.example.UniversityFacultyDemo.service;

import com.example.UniversityFacultyDemo.Repository.DepartmentRepository;
import com.example.UniversityFacultyDemo.Repository.StudentRepository;
import com.example.UniversityFacultyDemo.entity.Department;
import com.example.UniversityFacultyDemo.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface DepartmentService  {


    List<Department> findAll();
}
