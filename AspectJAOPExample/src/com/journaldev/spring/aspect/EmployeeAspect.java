package com.journaldev.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	
	private static final Logger logger = Logger.getLogger(EmployeeAspect.class);
	
	
	/*
	 * The spring parameter passed in the @before annotation is the Pointcut expression
	 * This will execute for any Spring Bean method with signature public String getName()
	 * if we will create Employee bean using new operator the advices will not be applied. 
	 * Only when we will use ApplicationContext to get the bean, advices will be applied.
	 */
	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
		logger.info("Executing Advice on getName()");
	}

	@Before("execution(* com.journaldev.spring.service.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
		logger.info("Service method getter called");
	}
}
