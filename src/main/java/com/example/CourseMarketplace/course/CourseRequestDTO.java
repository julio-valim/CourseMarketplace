package com.example.CourseMarketplace.course;

import jakarta.persistence.criteria.CriteriaBuilder;

public record CourseRequestDTO(String title, String cover, Integer price) {}
