package com.klef.jfsd.exam.Service;

import java.util.List;

import com.klef.jfsd.exam.model.Course;

public interface CourseService
{
	public String addcourse(Course c);
	public List<Course> displayallcourses();

}
