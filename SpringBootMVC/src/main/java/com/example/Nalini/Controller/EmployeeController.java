package com.example.Nalini.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Nalini.dao.EmployeeRepo;
import com.example.Nalini.model.employee;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping("/")
	public String signup()
	{
		return "Signup.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(employee emp)
	{
		repo.save(emp);
		return "Signup.jsp";
	}

}
