package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dto.SubjectsDTO;
import com.app.pojos.Course;
import com.app.pojos.Subjects;
import com.app.repository.CourseRepository;
import com.app.repository.SubjectsRepository;

@Service
@Transactional
public class SubjectsService implements ISubjectsService {

	@Autowired
	private SubjectsRepository sr;
	@Autowired
	private CourseRepository cr;

	public Subjects addCourse(SubjectsDTO sub) {
		Course course = cr.findById(sub.getId())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid course: Course not found!!!"));
		Subjects s = new Subjects(sub.getSubjectName(), sub.getEndModuleTotalMarks(), sub.getCceeTotalMarks(), course,
				null);
		return sr.save(s);
	}

	public List<Subjects> getAllSubjects(int id) {
		Course c = cr.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Invalid course: Course not found!!!"));
		List<Subjects> s = sr.findByCourse(c);
		System.out.println(s.size());
		// System.out.println();

		return s;
	}
	
public void deleteSubjectsById(int id) {
		
		if(sr.existsById(id)) {
			sr.deleteById(id);
		}else {
			throw new ResourceNotFoundException("Invalid course: Course not found!!!");
		}
		
	}

}
