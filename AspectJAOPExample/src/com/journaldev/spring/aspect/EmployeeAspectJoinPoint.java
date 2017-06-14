package com.journaldev.spring.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

@Component
@Aspect
public class EmployeeAspectJoinPoint {
	
	private static final Logger logger = Logger.getLogger(EmployeeAspectJoinPoint.class);

	@Before("execution(public void com.journaldev.spring.model..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint){
		System.out.println("Before running loggingAdvice on method= "
				+joinPoint.toString());
		System.out.println("Arguments Passed=" + Arrays.toString(joinPoint.getArgs()));
		logger.info("Before running loggingAdvice on method= " +joinPoint.toString()
		+ "Arguments Passed= " +Arrays.toString(joinPoint.getArgs())		
		);	
	}
	
	//Advice arguments, will be applied to bean methods with single String arguments
	@Before("args(name)")
	public void logStringArguments(String name){
		System.out.println("String arguments passed= " +name);
		logger.info("String arguments passed= " +name);
	}
	
}
