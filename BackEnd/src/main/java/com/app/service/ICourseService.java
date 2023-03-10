package com.app.service;

import java.util.List;

import com.app.pojos.Course;

public interface ICourseService {
	public Course addCourse(Course course);
	public List<Course> getAllCourse();
	public Course getCourseById(int id);
	public void deleteCourseById(int id);

}
