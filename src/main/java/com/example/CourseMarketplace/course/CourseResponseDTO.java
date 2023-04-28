package com.example.CourseMarketplace.course;

public record CourseResponseDTO(Long id, String title, String cover, Integer price) {
    public CourseResponseDTO(Course course){
        this(
                course.getId(),
                course.getTitle(),
                course.getCover(),
                course.getPrice()
        );
    }
}
