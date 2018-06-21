package com.chandru.studentdatabase.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandru.studentdatabase.entity.StudentEntity;
import com.chandru.studentdatabase.repository.StudentRepository;
@Service
public class StudentService{
	@Autowired
	StudentRepository studentRepository;
	
	public List getStudents(){
		
		List topicList = new ArrayList();
		 studentRepository.findAll().forEach(topicList :: add);
		 return topicList;
	}
	
	public String inserStudents(StudentEntity studentEntity){
		 studentRepository.save(studentEntity);
		 return "success";
	}
	
	public Optional<StudentEntity> getStudent(Long id){
		 return studentRepository.findById(id);
	}
}
