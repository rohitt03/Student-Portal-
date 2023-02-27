package com.app.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

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
public class Announcement extends BaseEntity implements Serializable {

	@Column(length = 100)
	private String annName;

	@Column(length = 100)
	private String annLink;

}
