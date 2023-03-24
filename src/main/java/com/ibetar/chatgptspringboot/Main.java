package com.ibetar.chatgptspringboot;

//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

//	@Bean
//	public OpenAPI customOpenApi(){
//		return new OpenAPI()
//				.info(new Info()
//						.title("ChatGPT API Rest")
//						.version("1.0")
//						.description("ChatGPT with Spring Boot")
//						.contact(new Contact()
//								.email("ilichbr@gmail.com")
//								.name("Ilich Betancourt Rangel - Backend Developer | Mechanical Engineer"))
//						.termsOfService("http://www.")
//						.license(new License()
//								.name("Apache License, Version 2.0")
//								.url("http://www.apache.org/licenses/")));
//	}

}
