package com.allinone.practice.REST;

import com.allinone.practice.model.Student;
import com.allinone.practice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("student/")
@Validated
public class StudentResources {
    @Autowired
    StudentService studentService;

    @RequestMapping("/show")
    public List<Student> showall() throws Exception {
        List<Student> students=studentService.findAll();
        if(students==null){
            throw new Exception("Not Found");
        }
        return students;
    }
    @RequestMapping("/delete/{id}")
    public Student deleteById(@PathVariable("id") int id) throws Exception {
        Student student=studentService.findById(id);
        if(student==null){
            throw new Exception("No such student with id:" +id+" found");
        }
     return studentService.deleteById(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST, produces = "application/json")
    public Student save(@Valid @RequestBody Student student) throws Exception{
        System.out.println("");
        Student student1=studentService.save(student);
        if(student1==null){
             new Exception("Failed to save Student.. Try Again");
        }
         return student1;
    }
}
