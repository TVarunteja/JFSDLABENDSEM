package com.klef.jfsd.exam.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Course;
import com.klef.jfsd.exam.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService 
{
	@Autowired
	private CourseRepository repository;

	@Override
	public String addcourse(Course c) {
		repository.save(c);
		return "Course Added Successfully";
	}

	@Override
	public List<Course> displayallcourses() {
		return (List<Course>) repository.findAll();
	}

	

}
