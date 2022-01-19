package com.example.UniversityFacultyDemo.Repository;

import com.example.UniversityFacultyDemo.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    static void delete(long id) {
    }
}
