package com.allinone.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/")
    public String showHome(){
        return "index";
    }

    @GetMapping("/admin")

    public String showAdmin()
    {
        return "admin";
    }

    @GetMapping("/user")

    public String showuser()
    {
        return "user";
    }

}
