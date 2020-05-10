package com.example.Nalini;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.example.Nalini.model.user;




@Controller
public class MyController {

	
	@RequestMapping("hello")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("show")
	public ModelAndView show(user u) 
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",u);
		mv.setViewName("show.jsp");
		return mv;
	}

}
