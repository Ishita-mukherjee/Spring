package com.spring.core.lifecycle.Demo3;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setting name");

	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}

}
