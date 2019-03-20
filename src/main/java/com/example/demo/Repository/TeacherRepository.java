package com.example.demo.Repository;

import com.example.demo.Model.Teacher;
import org.springframework.data.repository.CrudRepository;


public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    Iterable<Teacher> findAll();


}
