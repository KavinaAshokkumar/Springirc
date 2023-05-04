package com.example.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
	title = "Mapping",
	version = "1.1.3",
		description = "One to Many",
	contact = @Contact(
				name = "Kavina Ashokkumar",
				email = "727821tuec107@skct.edu.in"
				)
		)
)
public class MappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}

}
