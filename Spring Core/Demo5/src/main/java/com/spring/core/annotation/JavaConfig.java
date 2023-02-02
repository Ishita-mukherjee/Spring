package com.spring.core.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.spring.core.annotation")
public class JavaConfig {
	@Bean
	public Course getCourse()
	{
		return new Course();
	}
	
	@Bean
	public Student getStudent()
	{
		Student student = new Student(getCourse());
		return student;
	}

}
