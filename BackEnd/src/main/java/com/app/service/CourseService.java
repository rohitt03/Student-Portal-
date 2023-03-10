package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.pojos.Course;
import com.app.repository.CourseRepository;

@Service
@Transactional
public class CourseService implements ICourseService {

	@Autowired
	private CourseRepository cr;

	public Course addCourse(Course course) {
		return cr.save(course);
	}

	public List<Course> getAllCourse() {
		return cr.findAll();
	}

	public Course getCourseById(int id) {
		return cr.findById(id).orElseThrow(() -> new ResourceNotFoundException("Invalid course: Course not found!!!"));
	}
	
	public void deleteCourseById(int id) {
		
		if(cr.existsById(id)) {
			cr.deleteById(id);
		}else {
			throw new ResourceNotFoundException("Invalid course: Course not found!!!");
		}
		
	}
	


}
