package com.example.demo.classexp3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kavvs {
      @Value("${flowername}")
      public String flower;
      
      @GetMapping("/kaviii")
      
      public String display()
      {
    	  return "My favourite flower is "+flower;
      }
}
