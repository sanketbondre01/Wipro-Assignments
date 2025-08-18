package com.schoolmanagement.repository;

import com.schoolmanagement.entity.Teacher;
import com.schoolmanagement.entity.Teacher.Qualification;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	List<Teacher> findByQualification(Qualification qualification);

	void deleteByTeacherAddress(String teacherAddress);

}