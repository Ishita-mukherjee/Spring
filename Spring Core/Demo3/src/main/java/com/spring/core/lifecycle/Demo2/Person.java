package com.spring.core.lifecycle.Demo2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean{
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

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying");
	}

	

}
