package com.schoolmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.schoolmanagement.entity.School;
import com.schoolmanagement.repository.SchoolRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class SchoolServiceImpl implements SchoolService {
	
	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public School saveSchool(School school) {
		
		return schoolRepository.save(school);
	}

	
	@Override
	public List<School> findAllSchools() {
		
		return schoolRepository.findAll();
	}


	@Override
	public School updateSchool(Long id, School s) {
	    School existingSchool = schoolRepository.findById(id)
	        .orElseThrow(() -> new EntityNotFoundException("School not found with id: " + id));

	    existingSchool.setSchoolName(s.getSchoolName());
	    existingSchool.setSchoolAddress(s.getSchoolAddress());
	    existingSchool.setTeacherId(s.getTeacherId());

	    return schoolRepository.save(existingSchool);
	}


	@Override
	public School patchSchoolName(Long id, String name) {
	    School existingSchool = schoolRepository.findById(id)
	        .orElseThrow(() -> new RuntimeException("School not found with id: " + id));

	
	    existingSchool.setSchoolName(name != null ? name.trim() : null);

	    return schoolRepository.save(existingSchool);
	}


	@Override
	public void deleteSchool(Long id) {
		schoolRepository.deleteById(id);
		
	}


	@Override
	public List<School> getSchoolByAddress(String schoolAddress) {
		return schoolRepository.findBySchoolAddress(schoolAddress);
	}


	@Override
	public void deleteByAddress(String schoolAddress) {
		schoolRepository.deleteBySchoolAddress(schoolAddress);
		    }
	
	@Override
	public List<School> searchSchoolsByName(String keyword) {
		return schoolRepository.searchBySchoolName(keyword);
		
	}


}