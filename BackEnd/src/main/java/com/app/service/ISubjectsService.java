package com.app.service;

import java.util.List;

import com.app.dto.SubjectsDTO;
import com.app.pojos.Subjects;

public interface ISubjectsService {
	public Subjects addCourse(SubjectsDTO sub);
	public List<Subjects> getAllSubjects(int id);
	public void deleteSubjectsById(int id);

}
