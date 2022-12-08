package com.example.courseApp_backend.dao;

import com.example.courseApp_backend.model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseDao extends CrudRepository<Course,Integer> {

    @Query(value="SELECT `id`, `course_date`, `course_description`, `course_duration`, `course_title`, `course_venue` FROM `course_add` WHERE `course_title`= : courseTitle",nativeQuery = true)
    List<Course> searchCourse(@Param("courseTitle") String courseTitle);
}
