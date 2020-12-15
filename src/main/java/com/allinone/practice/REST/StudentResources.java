package com.allinone.practice.REST;

import com.allinone.practice.model.Student;
import com.allinone.practice.restexception.ResourceNotFoundException;
import com.allinone.practice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student/")
public class StudentResources {
    @Autowired
    StudentService studentService;

    @RequestMapping("/show")
    public List<Student> showall() throws Exception {
        List<Student> students=null;
        if(students==null){
            throw new Exception("Not Found");
        }
        return students;
    }
}
