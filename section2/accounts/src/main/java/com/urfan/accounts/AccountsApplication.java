package com.urfan.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info =
@Info(
		title = "Accounts Microservices REST API Documentation",
		description = "Accounts microservice REST API Documentation",
		version = "v1",
		contact = @Contact(
				name = "Urfan",
				email = "urfanmusayev2003@gmail.com",
				url = "https://www.urfanmusayev.com"
		),
		license = @License(
				name = "Apache 2.0",
				url = "https://www.urfanmusayev.com"
		)
	),
		externalDocs = @ExternalDocumentation(
				description = "Accounts Microservices REST API Documentation",
				url = "https://www.urfanmusayev.com"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
