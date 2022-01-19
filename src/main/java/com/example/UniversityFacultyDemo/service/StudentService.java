package com.example.UniversityFacultyDemo.service;

import com.example.UniversityFacultyDemo.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    
    public List<Student> getAllStudent();

    public void recordsUpdate(Student student);

    public Student getById(long id);

    public void delete(long id);

    public Student update(Student student);

    Student save(Student student);

    Object findAll();

    Optional<Object> findById(long id);
}
