package com.chandru.studentdatabase.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chandru.studentdatabase.entity.StudentEntity;
import com.chandru.studentdatabase.service.StudentService;



@RestController
public class StudentController {
	@Autowired
	private StudentService studentService ;
	
	@RequestMapping("/allStudents")
	public List fetchAllStudents(){
		System.out.println("allStudents Rest called...........");		
		return studentService.getStudents();		
	}
	
	
	@RequestMapping(method=RequestMethod.POST , value ="/insertStudents")
	public String insertStudents(@RequestBody StudentEntity studentEntity){
		System.out.println("insertStudents Rest called...........");	
		return studentService.inserStudents(studentEntity);
		
	}
	
	@RequestMapping("/student/{id}")
	public Optional<StudentEntity> getStudent(@PathVariable Long id){
		System.out.println("getStudent"+ id +"Rest called...........");		
		return studentService.getStudent(id);
	}
	
	

}
