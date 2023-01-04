package com.spring.com.lifecycle.Demo1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method");
	}


	

}
