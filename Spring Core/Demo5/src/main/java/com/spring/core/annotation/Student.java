package com.spring.core.annotation;

import org.springframework.stereotype.Component;
//@Component
public class Student {
	
	private Course c;
	
	
	public Student(Course c) {
		super();
		this.c = c;
	}


	public Course getC() {
		return c;
	}


	public void setC(Course c) {
		this.c = c;
	}


	public void study()
	{
		this.c.display();
		System.out.println("studying");
	}

}
