package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Subjects extends BaseEntity {

	@Column(length = 50)
	private String subjectName;

	private int endModuleTotalMarks;

	private int cceeTotalMarks;
	
	@ManyToOne
	@JoinColumn
	private Course course;
	
	@JsonIgnore
	@OneToMany(mappedBy = "subjects", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Marks> marks;

}
