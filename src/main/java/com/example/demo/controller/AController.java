package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Student;
import com.example.demo.service.AService;

@RestController
public class AController {
    @Autowired
    private AService aService;

    @RequestMapping("/home")
    public String home() {
        return aService.say();
    }

    @RequestMapping("/name")
    public String findName() {
        return aService.findName();
    }

    @RequestMapping("/student")
    /* @ResponseBody */
    public List<Student> findStudent() {
        return aService.findStudent();

    }

    @RequestMapping("/hello")
    public ModelAndView hello() {
        return aService.hello();

    }
}
