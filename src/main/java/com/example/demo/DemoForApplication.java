package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableCaching
//@EnableAspectJAutoProxy // 开启aop
public class DemoForApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoForApplication.class, args);
	}

}
