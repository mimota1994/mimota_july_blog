package com.springboot.myblogtest3.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages= {"com.springboot.myblogtest3"})
public class Myblog3Application {


	public static void main(String[] args) {
		SpringApplication.run(Myblog3Application.class, args);
	}

}
