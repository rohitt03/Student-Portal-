package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Course extends BaseEntity {

	@Column(length = 50)
	private String courseName;
	
	@OneToOne(mappedBy = "course", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private TimeTable timeTable;
	
	@OneToMany(mappedBy = "course", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Student> student;
	
	@OneToMany(mappedBy = "course", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Subjects> subject;
	
			

}
