package com.chandru.studentdatabase.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandru.studentdatabase.entity.SemesterEntity;
import com.chandru.studentdatabase.entity.StudentEntity;
import com.chandru.studentdatabase.repository.SemesterRepository;
@Service
public class SemesterService{
	@Autowired
	SemesterRepository semesterRepository;
	
	public List getAllSemester(Long id){		
		 return semesterRepository.findByStudentEntityStudentId(id);
	}
	
	public String insertSemester(SemesterEntity semesterEntity){
		semesterRepository.save(semesterEntity);
		 return "success";
	}
	
	public Optional<SemesterEntity> getSemesterById(Long id){
		 return semesterRepository.findById(id);
	}
}
