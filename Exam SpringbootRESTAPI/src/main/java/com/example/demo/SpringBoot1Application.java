package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//Aadi he change yetai ka bg tula ..tu update karu shaktoy without overload

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo.*")
public class SpringBoot1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot1Application.class, args);
		
		
	}

}
