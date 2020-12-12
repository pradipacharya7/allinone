package com.allinone.practice.repository;

import com.allinone.practice.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {
   List<Student> findAll();
  Student save(Student Student);
  Student deleteById(int id);
  Student findById(int id);
}
