package com.app.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Course;

@SpringBootTest
class CourseServiceApplicationTest {

	@Autowired
	private ICourseService cs;
	
	@Test
	 void testAddCourse() {
		cs.addCourse(new Course("DAC", null, null, null));
		cs.addCourse(new Course("DBDA", null, null, null));
		cs.addCourse(new Course("DITISS", null, null, null));
	}
	
	@Test
	void testDeleteCourse() {
		cs.deleteCourseById(2);
	}
}
