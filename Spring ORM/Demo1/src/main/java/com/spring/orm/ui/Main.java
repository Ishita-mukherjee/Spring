package com.spring.orm.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.StudentEntity;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao =  context.getBean("studentDao",StudentDao.class);
        StudentEntity student = new StudentEntity(34, "Ishita", "Kolkata");
        int r = studentDao.insert(student);
        System.out.println("Done"+r);
      


	}

}
