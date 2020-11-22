package com.springbootannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.springbootannotation", "com.springbootannotation.scan" })
@SpringBootApplication
public class SpringBootAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationApplication.class, args);

	}

}
