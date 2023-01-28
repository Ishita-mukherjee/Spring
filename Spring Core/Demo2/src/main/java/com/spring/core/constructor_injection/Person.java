package com.spring.core.constructor_injection;

public class Person {
	
	private String name;
	private int id;
	private Certificate c;
	
	public Person(String name, int id, Certificate c) {
		super();
		this.name = name;
		this.id = id;
		this.c = c;
	}
	
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", c=" + c.name + "]";
	}
	
	
	

}
