package net.javaguides.departmentservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "Department Service REST APIs",
				description = "Department Service REST APIs Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Kerem",
						email = "keremcengiz0@hotmail.com",
						url = "https://github.com/keremcengiz0/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://github.com/keremcengiz0/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Department-Service Documentation",
				url = "https://github.com/keremcengiz0/"
		)
)

@SpringBootApplication
//@EnableEurekaClient
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
