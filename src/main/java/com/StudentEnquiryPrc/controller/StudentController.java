package com.StudentEnquiryPrc.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.StudentEnquiryPrc.entity.Student;
import com.StudentEnquiryPrc.entity.StudentEntity;
import com.StudentEnquiryPrc.repo.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepo repo;
	
	@GetMapping("/")
	private String loadIndexPage(Model model) {
		
		init(model);
		
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("student", new Student());
		System.out.println(repo.getcourses());
		model.addAttribute("courses", repo.getcourses());
	}
	
	@PostMapping("/save")
	private String handleSave(Student student, Model model) {
		System.out.println(student);
		
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		System.out.println(entity);
		repo.save(entity);
		
		init(model);
		return "index";
	}

}
