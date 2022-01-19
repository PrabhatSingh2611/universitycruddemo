package com.example.UniversityFacultyDemo.service;

import com.example.UniversityFacultyDemo.Repository.SubjectRepository;
import com.example.UniversityFacultyDemo.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> findAll() {
        return null;
    }

    @Override
    public List<Object> findById(long subId) {
        return null;
    }
}
