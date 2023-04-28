package com.example.CourseMarketplace.controller;

import com.example.CourseMarketplace.course.Course;
import com.example.CourseMarketplace.course.CourseRepository;
import com.example.CourseMarketplace.course.CourseRequestDTO;
import com.example.CourseMarketplace.course.CourseResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {
    @Autowired
    private CourseRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCourse(@RequestBody CourseRequestDTO data){
        Course courseData = new Course(data);
        repository.save(courseData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<CourseResponseDTO> getAll(){
        List<CourseResponseDTO> courseList = repository.findAll().stream().map(CourseResponseDTO::new).toList();
        return courseList;
    }
}
