package com.example.springboot;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Spring Boot REST API Documentation",
				description = "Spring Boot REST API Documentation using springdoc-openapi and OpenAPI 3.0",
				version = "v1.0",
				contact = @Contact(
						name = "Matthew Alfredo",
						email = "matthewwalfredoo@gmail.com",
						url = "https://github.com/matthewalfredoo"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/matthewalfredoo"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot User Management Documentation",
				url = "https://github.com/matthewalfredoo"
		)
)
public class SpringbootRestfulWebServicesApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfulWebServicesApplication.class, args);
	}

}
