package com.example.UniversityFacultyDemo.service;

import com.example.UniversityFacultyDemo.Repository.GroupRepository;
import com.example.UniversityFacultyDemo.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GroupServiceImpl implements GroupService{

    @Autowired
private GroupRepository groupRepository;

    @Override
    public List<Group> findAll() {
        return null;
    }
}
