package com.lpu.springbootdemo.service;

import com.lpu.springbootdemo.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceClass implements StudentService {
    public Student save(Student student) {
        System.out.println("Student Id: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        return student;
    }


}
