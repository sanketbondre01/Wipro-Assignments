package com.student.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.example.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}