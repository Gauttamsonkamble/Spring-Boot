package com.example.Gauttam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String home()
	{
		return "home.jsp";
	}

}
