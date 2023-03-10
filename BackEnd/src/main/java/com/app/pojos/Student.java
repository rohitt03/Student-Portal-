package com.app.pojos;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Student {
	@Id
	private String prn;

	@Column(length = 50)
	private String firstName;

	@Column(length = 50)
	private String lastName;

	private LocalDate dob;

	@Column(length = 100)
	private String mail;

	@Column(length = 50)
	private String password;
	
	@ManyToOne
	@JoinColumn
	private Course course;
	
	@OneToMany(mappedBy = "student", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Attendance> attendance;
	
	@OneToMany(mappedBy = "student", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Marks> marks;
	
}
