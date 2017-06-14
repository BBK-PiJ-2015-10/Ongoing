package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext  ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//EmployeeService employeeService = ctx.getBean("employeeService",EmployeeService.class);
		EmployeeService employeeService = ctx.getBean(EmployeeService.class);
		
		employeeService.getEmployee().getName();
		
		employeeService.getEmployee().setName("Alexander Otero");
		
		//System.out.println("Ale Birutita");
		
		employeeService.getEmployee().throwException();
		
		
		System.out.println("Ale Tontolino");

	}

}
