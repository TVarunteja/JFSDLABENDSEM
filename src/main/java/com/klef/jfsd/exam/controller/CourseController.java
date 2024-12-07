package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.Service.CourseService;
import com.klef.jfsd.exam.model.Course;

@RestController
@RequestMapping("course")
public class CourseController 
{
	@Autowired
	private CourseService service;
	
	@GetMapping("/")
	public String home()
	{
		return "Rest API With JPA";
	}
	
	@PostMapping("add")
    public String addcourse(@RequestBody  Course course)
    {
		return service.addcourse(course);	
    }
	@GetMapping("viewall")
	public List<Course> viewallcourses()
	{
		return service.displayallcourses();
	}
	
}
