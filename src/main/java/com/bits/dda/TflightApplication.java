package com.bits.dda;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Swagger Demo", version = "1.0", description = "Documentation APIs v1.0"))
public class TflightApplication {

	public static void main(String[] args) {
		SpringApplication.run(TflightApplication.class, args);
	}

}
