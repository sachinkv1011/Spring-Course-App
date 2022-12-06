package com.example.courseApp_backend.controller;

import com.example.courseApp_backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addCourse(@RequestBody Course c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());
        return "Course added successfully";
    }

    @GetMapping("/viewall")
    public String viewAll(){
        return "view all the courses";
    }
}
