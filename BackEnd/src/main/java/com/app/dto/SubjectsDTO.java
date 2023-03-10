package com.app.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubjectsDTO {

	private int id;

	private String subjectName;

	private int endModuleTotalMarks;

	private int cceeTotalMarks;

}
