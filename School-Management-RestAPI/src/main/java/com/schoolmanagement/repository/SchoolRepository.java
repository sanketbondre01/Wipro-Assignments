package com.schoolmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.schoolmanagement.entity.School;


@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

	List<School> findBySchoolAddress(String schoolAddress);

	void deleteBySchoolAddress(String schoolAddress);
	
	 @Query("SELECT s FROM School s WHERE LOWER(s.schoolName) LIKE LOWER(CONCAT('%', :keyword, '%'))")
	    List<School> searchBySchoolName(String keyword);

}