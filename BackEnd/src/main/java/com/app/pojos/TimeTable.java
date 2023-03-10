package com.app.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@SuppressWarnings("serial")
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"course"}))
public class TimeTable implements Serializable {

	@Id
	@OneToOne
	@JoinColumn()
	private Course course;

	
	@Column(length = 300)
	private String link;
	
	
}
