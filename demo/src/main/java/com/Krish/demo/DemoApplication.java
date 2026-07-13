package com.Krish.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Student student = new Student("Krish" , 20);
		student.setage(19);
		student.getage();
		student.setname("Rahul");
		student.getname();
	}

}
