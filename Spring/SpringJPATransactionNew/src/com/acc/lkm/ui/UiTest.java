package com.acc.lkm.ui;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.service.EmployeeService;


public class UiTest {
@SuppressWarnings("resource")
	public static void main(String[] args) {
	EmployeeService employeeService=null;
	try {
		//ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringMainConfig.class);
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/acc/lkm/resources/cst-main-config.xml");
	    employeeService=(EmployeeService)applicationContext.getBean("employeeServiceImpl");
	    
	    //Add Employee
	    addEmployee(employeeService);
	     //getEmployeeDetails(employeeService);
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	
	}

private static void getEmployeeDetails(EmployeeService employeeService) {
	try {
		EmployeeBean employeeBean=employeeService.getEmployeeDetails(2);
		if(employeeBean==null) {
			System.out.println("Invalid Employee ID");
		}
		else {
			System.out.println("Employee Details");
			System.out.println("===========");
			System.out.println("Name: " + employeeBean.getName());
			System.out.println("Salary: " +employeeBean.getSalary());
			System.out.println("Role: " + employeeBean.getRole());
		}
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	
}

private static void addEmployee(EmployeeService employeeService) {
	EmployeeBean bean= new EmployeeBean();
	bean.setInsertTime(new Date());
	bean.setName("Suraj Singh");
	bean.setRole("Sr.Analyst");
	bean.setSalary(75000.00);
	try {
		int id=employeeService.addEmployee(bean);
		System.out.println("Employee registered successfully: " + id);
	}catch(Exception ex) {
		System.out.println(ex.getMessage());
	}
	
}

}
