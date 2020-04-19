package com.example.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@Controller
@RestController
public class HomeController {
	
	@RequestMapping("home")
	@ResponseBody
	public String welcome()
	{
		
		System.out.println("Welcome");
		return "Homepage";
	}

}
