package com.example.Gauttam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Gauttam.dao.StudentRepo;
import com.example.Gauttam.model.student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(student stud)
	{
		repo.save(stud);
		return "home.jsp";
	}

}
