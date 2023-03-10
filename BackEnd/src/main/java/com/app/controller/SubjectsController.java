package com.app.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.SubjectsDTO;
import com.app.pojos.Subjects;
import com.app.service.ISubjectsService;

@RestController
@RequestMapping("/subjects")
@CrossOrigin(origins = "http://localhost:3000")
public class SubjectsController {
	@Autowired
	private ISubjectsService ss;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAllSubjects(@PathVariable int id){
		return new ResponseEntity<List<Subjects>>(ss.getAllSubjects(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> addSubjects(@RequestBody SubjectsDTO sdto){
		return new ResponseEntity<Subjects>(ss.addCourse(sdto),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteSubjects(@PathVariable int id){
		ss.deleteSubjectsById(id);
		return new ResponseEntity<ApiResponse>(new ApiResponse("deleted successfully"),HttpStatus.OK);
	}

}
