package com.StudentEnquiryPrc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.StudentEnquiryPrc.entity.Student;
import com.StudentEnquiryPrc.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{
	
	@Query("SELECT distinct(course) FROM StudentEntity")
	public List<String> getcourses();

}
