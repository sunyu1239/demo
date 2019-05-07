package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.BService;

@Controller
public class BController {
    @Autowired
    private BService bService;

    @RequestMapping("/getStudent")
    public void getStudent() {

    }
}
