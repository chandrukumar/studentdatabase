package com.chandru.studentdatabase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SemesterEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	@Column(name = "semester_id")
	Long semesterId;
	String mark1;
	String mark2;
	String mark3;
	String mark4;
	String mark5;
	@ManyToOne
	StudentEntity studentEntity;
	public StudentEntity getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(StudentEntity studentEntity) {
		this.studentEntity = studentEntity;
	}

	public String getMark1() {
		return mark1;
	}

	public void setMark1(String mark1) {
		this.mark1 = mark1;
	}

	public String getMark2() {
		return mark2;
	}

	public void setMark2(String mark2) {
		this.mark2 = mark2;
	}

	public String getMark3() {
		return mark3;
	}

	public void setMark3(String mark3) {
		this.mark3 = mark3;
	}

	public String getMark4() {
		return mark4;
	}

	public void setMark4(String mark4) {
		this.mark4 = mark4;
	}

	public String getMark5() {
		return mark5;
	}

	public void setMark5(String mark5) {
		this.mark5 = mark5;
	}

	public Long getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(Long semesterId) {
		this.semesterId = semesterId;
	}
	public SemesterEntity(){
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public SemesterEntity(Long id , Long studentId ,Long semesterId, String mark1 ,String mark2 , String mark3 , String mark4, String mark5) {
		super();
		this.id = id;
		this.semesterId = semesterId;
		this.studentEntity=new StudentEntity(studentId, "", "");
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
		this.mark5 = mark5;
	}

}
