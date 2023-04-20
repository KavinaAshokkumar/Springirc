package com.example.demo.classexp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class main {
   @GetMapping("/hi")
   @ResponseBody
   public String Welcome()
   {
	   return "Welcome to RestApi class";
   }
}
