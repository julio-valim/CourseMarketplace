package com.example.CourseMarketplace.controller;

import com.example.CourseMarketplace.course.Course;
import com.example.CourseMarketplace.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseRepository repository;
    @GetMapping
    public List<Course> getAll(){
        List<Course> courseList = repository.findAll();
        return courseList;
    }
}
