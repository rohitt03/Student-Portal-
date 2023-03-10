package com.app.pojos;



import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"student","subjects"}))
public class Marks extends BaseEntity  {

	@ManyToOne
	@JoinColumn
	private Student student;
	
	@ManyToOne
	@JoinColumn
	private Subjects subjects;
	
	private Double mark;
	
}
