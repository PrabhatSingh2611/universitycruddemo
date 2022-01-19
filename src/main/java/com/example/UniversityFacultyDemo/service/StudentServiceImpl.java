package com.example.UniversityFacultyDemo.service;

import com.example.UniversityFacultyDemo.Repository.StudentRepository;
import com.example.UniversityFacultyDemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    //private static List<Student> studentrecords = new ArrayList<>();

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    //getting all student record by using the method findaAll() of CrudRepository
    @Override
    public List<Student> getAllStudent() {
        List<Student> studentRecords = new ArrayList<Student>();
        studentRepository.findAll().forEach(studs -> studentRecords.add(studs));
        return studentRecords;
    }

    //saving a specific record by using the method save() of CrudRepository
    @Override
    public void recordsUpdate(Student student) {
        studentRepository.save(student);
    }

    //getting a specific record by using the method findById() of CrudRepository
    @Override
    public Student getById(long id) {
        return studentRepository.findById(id).get();
    }


    //deleting a specific record by using the method deleteById() of CrudRepository
    @Override
    public void delete(long id) {
        StudentRepository.delete(id);
    }



    //updating a record
    @Override
    public Student update(Student student) {
       return  studentRepository.save(student);
    }

    @Override
    public Student save(Student student) {
return studentRepository.save(student);
    }

    @Override
    public Object findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Object> findById(long id) {
        return Optional.of(studentRepository.findById(id));

    }


}



