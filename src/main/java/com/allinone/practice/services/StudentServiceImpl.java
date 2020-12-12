package com.allinone.practice.services;

import com.allinone.practice.model.Student;
import com.allinone.practice.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService{
    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student deleteById(int id) {
        return studentRepo.deleteById(id);
    }

    @Override
    public Student findById(int id) {
        return studentRepo.findById(id);
    }
}
