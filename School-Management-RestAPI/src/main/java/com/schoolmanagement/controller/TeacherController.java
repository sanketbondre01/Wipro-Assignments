package com.schoolmanagement.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.schoolmanagement.entity.Teacher;
import com.schoolmanagement.entity.Teacher.Qualification;
import com.schoolmanagement.service.TeacherService;



@RestController
@RequestMapping
public class TeacherController {

	 @Autowired
	    private TeacherService teacherService;
	 
	 @PostMapping("/addTeacher")
	    public Teacher addTeacher(@RequestBody Teacher teacher) {
	    	return teacherService.addTeacher(teacher);
	    }
	 
	 @GetMapping("getAllTeachers")
	    public List<Teacher> getAllTeachers() {
	    	return teacherService.findAllTeachers();
	    }
	 
	 @PutMapping("/updateTeacher/{id}")
	    public Teacher update(@PathVariable Long id, @RequestBody Teacher t) {
	    return teacherService.updateTeacher(id, t);
	    }
	 
	 @PatchMapping("/patchTeacher/{id}")
	    public Teacher patchName(@PathVariable Long id, @RequestBody String name) {
	    	return teacherService.patchTeacherName(id, name);
	    }
	 
	 @DeleteMapping("/deleteTeacher/{id}")
	    public void delete(@PathVariable Long id) {
	    	teacherService.deleteTeacher(id);
	    }
	 
	 @GetMapping("/teachers/{qualification}")
	 public List<Teacher> getTeachersByQualification(@PathVariable Qualification qualification) {
	     return teacherService.getTeachersByQualification(qualification);
	 }
	 
	 @DeleteMapping("delete/{teacherAddress}")
	 public void deleteTeacherByAddress(@PathVariable  String teacherAddress) {
		 teacherService.deleteTeacherByAddress(teacherAddress);
	 }
	  
}