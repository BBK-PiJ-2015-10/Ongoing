package com.journaldev.spring.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAnnotationAspect {

	private static final Logger logger= Logger.getLogger(EmployeeAnnotationAspect.class);
	
	@Before("@annotation(com.journaldev.spring.aspect.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice");
		logger.info("Executing myAdvice");
	}
	
}