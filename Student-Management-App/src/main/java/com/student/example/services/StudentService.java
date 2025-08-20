package com.student.example.services;

import java.util.List;

import com.student.example.entities.Student;


public interface StudentService {

	public List<Student> getAll();

	public void save(Student student);

	public Student getById(Long id);

	public void delete(Long id);

}