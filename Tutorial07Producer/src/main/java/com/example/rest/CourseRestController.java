package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CourseModel;
import com.example.service.StudentService;

@RestController
@RequestMapping("/rest")
public class CourseRestController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/course/view/{id}")
    public CourseModel viewCourse ( @PathVariable(value = "id") String idCourse )
    {
        CourseModel course = studentService.selectCourse(idCourse);

        return course;
    }
	
	@RequestMapping("/course/viewall")
    public List<CourseModel> viewall ()
    {
        List<CourseModel> courses = studentService.selectAllCourses();
        
        return courses;
    }
	
}
