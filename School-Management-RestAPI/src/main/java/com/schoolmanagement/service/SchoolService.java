package com.schoolmanagement.service;

import java.util.List;

import com.schoolmanagement.entity.School;

public interface SchoolService {

	School saveSchool(School school);

	List<School> findAllSchools();

	School updateSchool(Long id, School s);

	School patchSchoolName(Long id, String name);

	void deleteSchool(Long id);

	List<School> getSchoolByAddress(String schoolAddress);

	void deleteByAddress(String schoolAddress);
	
	List<School> searchSchoolsByName(String keyword);

}