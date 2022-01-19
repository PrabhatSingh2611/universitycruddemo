package com.example.UniversityFacultyDemo.service;

import com.example.UniversityFacultyDemo.Repository.GroupRepository;
import com.example.UniversityFacultyDemo.entity.Group;
import com.example.UniversityFacultyDemo.entity.Subject;

import java.util.ArrayList;
import java.util.List;

public interface GroupService {


    List<Group> findAll();
}
