package com.dio.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Serve URL")})
@SpringBootApplication
public class ApispingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApispingApplication.class, args);
	}

}
