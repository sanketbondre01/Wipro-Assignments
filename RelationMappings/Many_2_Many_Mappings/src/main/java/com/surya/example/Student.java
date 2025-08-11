package com.surya.example;
 
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="student_subject", joinColumns = @JoinColumn(name="student_id"),
				inverseJoinColumns = @JoinColumn(name="subject_id"))
	private List<Subject> subjects;
		
}