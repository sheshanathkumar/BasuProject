package com.basu.jumpstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class JumpStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(JumpStartApplication.class, args);
	}

}
