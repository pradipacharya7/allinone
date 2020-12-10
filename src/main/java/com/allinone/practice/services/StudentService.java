package com.allinone.practice.services;

import com.allinone.practice.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    List<Student> findAll();
    Student save(Student Student);
    Student deleteById(int id);
}
