package com.journaldev.spring.model;

import com.journaldev.spring.aspect.Loggable;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private String name = "Dummy name";

	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String name) {
		this.name = name;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}

}
