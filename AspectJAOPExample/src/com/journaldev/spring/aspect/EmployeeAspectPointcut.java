package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;
import org.apache.log4j.Logger;

/*
 * Rather than expression we are using method name in the advice annotation argument.
 */
@Component
@Aspect
public class EmployeeAspectPointcut {
	
	private static final Logger logger = Logger.getLogger(EmployeeAspectPointcut.class);

	@Before("getNamePointcut()")
	public void loggingAdvice(){
		System.out.println("Executing loggingAdvice on getName()");
		logger.info("Executing loggingAdvice on getName()");
	}
	
	@Before("getNamePointcut()")
	public void secondAdvice(){
		System.out.println("Executing secondAdvice on getName()");
		logger.info("Executing secondAdvice on getName()");
		
	}
	
	@Pointcut("execution(public String getName())")
	public void getNamePointcut(){}
	
	
	
	@Before("allMethodsPointcut()")
	public void allServiceMethodsAdvice(){
		System.out.println("Before executing service method");
		logger.info("Before executing service method");
	}
	
	//Pointcut to execute on all the methods of classes in a package
	@Pointcut("within(com.journaldev.spring.service.*)")
	public void allMethodsPointcut(){}
	
	

}
