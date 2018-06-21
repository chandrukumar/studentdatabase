package com.chandru.studentdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandru.studentdatabase.entity.StudentEntity;


@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

}
