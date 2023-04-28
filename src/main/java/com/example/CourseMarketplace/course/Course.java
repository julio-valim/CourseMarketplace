package com.example.CourseMarketplace.course;

import jakarta.persistence.*;

@Table(name = "courses")
@Entity(name = "courses")
public class Course {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String cover;
    private Integer price;
}
