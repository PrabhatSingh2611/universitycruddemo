package com.example.UniversityFacultyDemo.controller;


import com.example.UniversityFacultyDemo.entity.Department;
import com.example.UniversityFacultyDemo.entity.Group;
import com.example.UniversityFacultyDemo.entity.Student;
import com.example.UniversityFacultyDemo.service.DepartmentServiceImpl;
import com.example.UniversityFacultyDemo.service.GroupServiceImpl;
import com.example.UniversityFacultyDemo.service.StudentServiceImpl;
import com.example.UniversityFacultyDemo.service.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Value("${spring.application.name}")
    String appName;

    @Autowired
    DepartmentServiceImpl departmentServiceImpl;

    @Autowired
    GroupServiceImpl groupServiceImpl;

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @Autowired
    SubjectServiceImpl subjectServiceImpl;

    @RequestMapping("/home")
    public String homePage(Model model){
        model.addAttribute("appName",appName);
        return "home";
    }

    @GetMapping("studentlist")
public List<Student> showMarks(long id){
        studentServiceImpl.findById(id);
        return (List<Student>) studentServiceImpl.findAll();
    }

    @GetMapping("grouplist")
    public List<Group> showGroup(long id) {
        studentServiceImpl.findById(id);
        return groupServiceImpl.findAll();
    }

    @GetMapping("departmentlist")
    public List<Department> showDepartment(long id) {
        studentServiceImpl.findById(id);
        return departmentServiceImpl.findAll();
    }


}
