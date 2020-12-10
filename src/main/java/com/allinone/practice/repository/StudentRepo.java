package com.allinone.practice.repository;

import com.allinone.practice.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {
}
