package com.chandru.studentdatabase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chandru.studentdatabase.entity.SemesterEntity;
import com.chandru.studentdatabase.entity.StudentEntity;
import com.chandru.studentdatabase.service.SemesterService;
import com.chandru.studentdatabase.service.StudentService;



@RestController
public class SemesterController {
	@Autowired
	private SemesterService semesterService ;
	
	@RequestMapping("/allSemester/{id}/semester")
	public List fetchAllStudents(@PathVariable Long id){	
		return semesterService.getAllSemester(id);		
	}
	
	
	@RequestMapping(method=RequestMethod.POST , value ="/student/{studentId}/insertSemester")
	public String insertStudents(@RequestBody SemesterEntity semesterEntity , @PathVariable Long studentId){
		semesterEntity.setStudentEntity(new StudentEntity(studentId, "", ""));
		System.out.println(semesterEntity.getStudentEntity().getStudentId());
		return semesterService.insertSemester(semesterEntity);
		
	}
	
	@RequestMapping("/semester/{id}")
	public Optional<SemesterEntity> getStudent(@PathVariable Long id){
		return semesterService.getSemesterById(id);
	}
	
	

}
