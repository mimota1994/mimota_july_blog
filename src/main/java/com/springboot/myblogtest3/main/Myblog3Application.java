package com.springboot.myblogtest3.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.springboot.myblogtest3"})
@MapperScan(basePackages = {"com.springboot.myblogtest3.dao"})
public class Myblog3Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Myblog3Application.class, args);
	}

}
