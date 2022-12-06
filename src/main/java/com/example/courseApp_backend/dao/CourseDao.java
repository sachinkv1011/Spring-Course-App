package com.example.courseApp_backend.dao;

import com.example.courseApp_backend.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Course,Integer> {
}
