package com.example.courseApp_backend.controller;

import com.example.courseApp_backend.dao.CourseDao;
import com.example.courseApp_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addCourse(@RequestBody Course c){
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());

        dao.save(c);
        return "Course added successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Course> viewAll(){
        return (List<Course>) dao.findAll();
    }
}
