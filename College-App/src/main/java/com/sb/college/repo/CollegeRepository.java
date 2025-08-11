package com.sb.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.college.entities.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

}
