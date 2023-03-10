package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Course;
import com.app.pojos.Subjects;

public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

	public List<Subjects> findByCourse(Course course);
	
}
