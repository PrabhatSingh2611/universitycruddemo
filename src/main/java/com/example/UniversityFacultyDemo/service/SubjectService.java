package com.example.UniversityFacultyDemo.service;

import com.example.UniversityFacultyDemo.Repository.SubjectRepository;
import com.example.UniversityFacultyDemo.entity.Subject;

import java.util.ArrayList;
import java.util.List;

public interface SubjectService {
    List<Subject> findAll();

    List<Object> findById(long subId);
}
