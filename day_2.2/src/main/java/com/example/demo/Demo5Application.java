package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Demo5Application.class, args);
		
		person pp= new person(29,"Kavina","20");
		
		ObjectMapper mapper = new ObjectMapper();
		
		String json= mapper.writeValueAsString(pp);
		
		System.out.println(json);
	}

}
