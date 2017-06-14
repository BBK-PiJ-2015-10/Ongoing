package com.journaldev.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAfterAspect {

	private static final Logger logger = Logger.getLogger("EmployeeAfterAspect.class");
	
	@After("args(name)")
	public void logStringArguments(String name){
		System.out.println("Running After Advice. String argument passed=" 
				+name);
		logger.info("Running After Advice. String argument passed= " +name);
	}
	
	//use within in pointcut expression to apply advice to all the methods in the class
	@AfterThrowing("within(com.journaldev.spring.model.Employee)")
	public void logExceptions(JoinPoint joinPoint){
		System.out.println("Exception thrown in Employee Method " 
				+joinPoint.toString()
	);
		logger.error("Exception thrown in Employee Method " +joinPoint.toString());
	}
	
	
	@AfterReturning(pointcut="execution(* getName())",returning="returnString")
	public void getNameReturningAdvice(String returnString){
		System.out.println("getNameReturningAdvice executed. Returned String= "
				+returnString);
		logger.info("getNameReturningAdvice executed. Returned String= " +returnString);;
	}
	
	
}
