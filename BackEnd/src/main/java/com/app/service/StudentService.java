package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.pojos.Course;
import com.app.pojos.Student;
import com.app.repository.CourseRepository;
import com.app.repository.StudentRepository;

@Transactional
@Service
public class StudentService implements IStudentService {
	@Autowired
	private StudentRepository sr;

	@Autowired
	private CourseRepository cr;

	public List<Student> getAllStudent(int id) {
		Course course = cr.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid course: Course not found!!!"));

		return sr.findByCourse(course);
	}
	
	

}
