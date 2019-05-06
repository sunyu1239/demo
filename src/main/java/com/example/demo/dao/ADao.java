package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Student;

@Mapper
public interface ADao {

    String findName();

    List<Student> findStudent();

}
