package com.example.KShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
	title = "K's Boutique",
	version = "1.1.2",
		description = "A Fashion Project",
	contact = @Contact(
				name = "Kavina Ashokkumar",
				email = "727821tuec107@skct.edu.in"
				)
		)
)
public class KShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(KShopApplication.class, args);
	}

}
