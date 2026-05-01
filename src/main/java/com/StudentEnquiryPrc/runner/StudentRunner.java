package com.StudentEnquiryPrc.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import com.StudentEnquiryPrc.entity.StudentEntity;
import com.StudentEnquiryPrc.repo.StudentRepo;


public class StudentRunner  implements ApplicationRunner{
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		StudentEntity student=new StudentEntity();
		student.setCourse("Java");
		  student.setEmail("mrde123@gmail.com");
		  student.setGender("M");
		  student.setName("Mohammed");
		  student.setCourse("Java");		  
		  studentRepo.save(student);
	}

	
	
	

}
