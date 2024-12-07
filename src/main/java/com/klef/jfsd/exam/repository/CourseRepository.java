package com.klef.jfsd.exam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.model.Course;

@Repository
public interface CourseRepository  extends CrudRepository<Course,Integer>
{

}
