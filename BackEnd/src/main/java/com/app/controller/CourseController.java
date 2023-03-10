package com.app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Admin;
import com.app.pojos.Course;
import com.app.service.ICourseService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private ICourseService cs;
	
	@GetMapping
	public ResponseEntity<?> getAllCourse(){
		return new ResponseEntity<List<Course>>(cs.getAllCourse(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> addCourse(@RequestBody Course course){
		System.out.println("----------");
		System.out.println("----------");
		return new ResponseEntity<Course>(cs.addCourse(course),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Admin admin){
		Map<String,String> map = new HashMap<>();
		map.put("username","rohit");
	    map.put("token", "123456");
	 return new ResponseEntity<>(map,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCourse(@PathVariable int id){
		System.out.println("----------");
		System.out.println("----------");
		System.out.println(id);
		cs.deleteCourseById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
