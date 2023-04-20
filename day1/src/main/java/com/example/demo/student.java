package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.*;

@Controller
public class student {
 
	@RequestMapping("/")
	@ResponseBody
	
	public String display()
	{
		return "Hi Kanishq";
	}
	
}
