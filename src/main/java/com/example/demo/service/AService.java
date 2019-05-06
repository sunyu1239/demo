package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ADao;
import com.example.demo.entity.Student;

@Service
public class AService {
    @Autowired
    private ADao aDao;

    public String say() {
        return "hi";
    }

    public String findName() {
        // TODO Auto-generated method stub
        return aDao.findName();
    }

    public List<Student> findStudent() {
        // TODO Auto-generated method stub
        return aDao.findStudent();
    }

    public ModelAndView hello() {
        // TODO Auto-generated method stub
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        List<Student> stuList = aDao.findStudent();
        Student stu = stuList.get(0);
        mv.addObject("stu", stu);
        mv.addObject("list", stuList);
        Date time = new Date();
        mv.addObject("time", time);
        return mv;
    }
}
