package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Course;
import com.app.pojos.Student;

public interface StudentRepository extends JpaRepository<Student,String> {

	List<Student> findByCourse(Course course);
}
