package com.example.UniversityFacultyDemo.controller;

import com.example.UniversityFacultyDemo.entity.Student;
import com.example.UniversityFacultyDemo.exception.ResourceNotFoundException;
import com.example.UniversityFacultyDemo.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/api/v1")
public class StudentController {


    @Autowired
    private StudentServiceImpl studentServiceImpl;
/*
    //request mapping to view all the records
    @RequestMapping("records")
    public String showUpdateForm(Model model) {
        model.addAttribute("student", studentServiceImpl.findAll());
        return "index";
    }
*/


    //creating a get mapping that retrieves all the students detail from the database
    @GetMapping("/students")
    private List<Student> getAllBooks()
    {
        return studentServiceImpl.getAllStudent();
    }

    //creating a get mapping that retrieves the detail of a specific student
    @GetMapping("/students/{id}")
    private Student getById(@PathVariable("id") long id)
    {
        return studentServiceImpl.getById(id);
    }

    //creating post mapping that create the student detail in the database
    @PostMapping("/students")
    private int saveRecords(@RequestBody Student student)
    {
        studentServiceImpl.save(student);
        return (int) student.getStudId();
    }

    ////creating post mapping that create the specific student detail in the database
    @PostMapping("students/{id}")
    public String updateStudent(@PathVariable("id") long id,Student student, Model obj) {
        studentServiceImpl.save(student);
        System.out.println(student);
        obj.addAttribute("student", studentServiceImpl.findAll());
        return "index";
    }

   //creating put mapping that updates the records
   @PutMapping("/students")
    private Student updateRecords(@RequestBody Student student)
    {
        studentServiceImpl.update(student);
        return student;
    }

    //createing put mapping that updates record by id
    @PutMapping ("students/{id}")
    public  String updateStudentRecords (@PathVariable(value = "id")long id, @RequestBody Student studentData ) throws ResourceNotFoundException {
        Student studentdata = (Student) studentServiceImpl.findById(id).orElseThrow(() ->  new ResourceNotFoundException( " No student  :: "  + id));
        studentdata.setStudName(studentData.getStudName());
        studentdata.setStudSurname(studentData.getStudSurname());
        studentdata.setStudAge(studentData.getStudAge());
        studentdata.setStudGender(studentData.getStudGender());
        studentdata.setGroup(studentData.getGroup());

        System.out.println(studentData);
        final  Student updatedStudent = studentServiceImpl.save(studentData);
        return "index";
    }

    //creating a delete mapping that deletes a specific student details
    @DeleteMapping("/students/{id}")
    private void deleteById(@PathVariable("bookid") long id)
    {
        studentServiceImpl.delete(id);
    }


}

