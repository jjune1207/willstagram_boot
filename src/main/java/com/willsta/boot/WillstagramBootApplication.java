package com.willsta.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = "com.willsta.boot")
@PropertySource("classpath:application.properties")
public class WillstagramBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WillstagramBootApplication.class, args);
	}

}
