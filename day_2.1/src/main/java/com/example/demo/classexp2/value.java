package com.example.demo.classexp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
        public String name="Kavina";
        @GetMapping("/kavi")
        public String getName()
        {
        	return "Welcome "+name;
        }
}
