package com.chandru.studentdatabase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandru.studentdatabase.entity.SemesterEntity;
import com.chandru.studentdatabase.entity.StudentEntity;


@Repository
public interface SemesterRepository extends JpaRepository<SemesterEntity, Long>{

	public List<SemesterEntity> findByStudentEntityStudentId(Long id);

}
