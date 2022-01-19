package com.example.UniversityFacultyDemo.controller;

import com.example.UniversityFacultyDemo.entity.Subject;
import com.example.UniversityFacultyDemo.service.StudentServiceImpl;
import com.example.UniversityFacultyDemo.service.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/api/subject")
public class SubjectController {

    @Autowired
    private SubjectServiceImpl subjectServiceImpl;
    private StudentServiceImpl studentServiceImpl;
    @RequestMapping("markslist")
    public List<Subject> showMarks(Model model) {
         return subjectServiceImpl.findAll();
    }

    @GetMapping("/{subId}/students/{studId}")
    Subject addingStudentAndSubject(@PathVariable long subId,
                                    @PathVariable long studId)
    {
      /*  Subject subject = (Subject) subjectServiceImpl.findById(subId).get();
        Object Student = studentServiceImpl.findById(studId).get();
        subject.getStudentEnrolled().add(student);
        return subjectServiceImpl.save(subject);

    }*/


return null;
}}
