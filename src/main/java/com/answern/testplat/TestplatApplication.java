package com.answern.testplat;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.didispace.swagger.EnableSwagger2Doc;

 
@EnableSwagger2Doc 
@SpringBootApplication 
public class TestplatApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestplatApplication.class, args);
	}
}
