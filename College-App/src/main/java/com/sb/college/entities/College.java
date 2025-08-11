package com.sb.college.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
		
	private String collegeName;
	
	private String collegeEmail;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeEmail() {
		return collegeEmail;
	}

	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}

	public College() {
		super();
	}

	
}