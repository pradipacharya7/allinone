package com.allinone.practice.controller;
import com.allinone.practice.model.Student;
import com.allinone.practice.services.AddressService;
import com.allinone.practice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    AddressService addressService;

    @Autowired
    StudentService studentService;

    @GetMapping("/addstudent")
    public String addStudentForm(@ModelAttribute("student") Student student, Model model){
        model.addAttribute("addresses",addressService.findAll());
        return "addstudent";
    }

    @RequestMapping(value = "/addstudent", method = RequestMethod.POST)
    public String addStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, RedirectAttributes redirectAttributes,Model model
    ){
        if(bindingResult.hasErrors())
        {
          model.addAttribute("addresses",addressService.findAll());
           return"addstudent";
        }
        else{
             studentService.save(student);
        }
        return "redirect:/student/showall";
    }

    @GetMapping("/showall")
    public String showAll(Model model){
        List<Student> students=studentService.findAll();
        for(Student s:students) {
            System.out.println(s.getName());
        }
        model.addAttribute("students",students);
        return "show";
    }
    @GetMapping ("/delete")
    public String deleteStudent(@RequestParam("id") int  id, Model model){
        System.out.println("*****************Delete method*************************");
        studentService.deleteById(id);
        return "redirect:/student/showall";
    }
    @GetMapping("/edit")
    public String editStudent(@RequestParam("id") int id, Model model){
    Student student=studentService.findById(id);
    model.addAttribute("student", student);
    model.addAttribute("addresses",addressService.findAll());
    return "addstudent";
     }

    @PostMapping("/edit")
   public String updateStudent(@RequestParam("id") int id,@Valid @ModelAttribute("student") Student std, Model model, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
          model.addAttribute("addresses",addressService.findAll());
          return "addstudent";
        }
        else studentService.save(std);
        return "redirect:/student/showall";
    }

}

