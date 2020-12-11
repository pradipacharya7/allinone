package com.allinone.practice.controller;

import com.allinone.practice.model.Student;
import com.allinone.practice.repository.StudentRepo;
import com.allinone.practice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/addstudent")
    public String addStudentForm(@ModelAttribute("student") Student student, Model model){
        return "addstudent";
    }

    @RequestMapping(value = "/addstudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student") Student student, RedirectAttributes redirectAttributes){
        if(student!=null)
        {
            studentService.save(student);
        }
        return "redirect:/student/showall";
    }

    @GetMapping("/showall")
    public String showAll(Model model){

        List<Student> students=studentService.findAll();
        System.out.println(students.toString());
        model.addAttribute("students", students);
        return "show";


    }
}

