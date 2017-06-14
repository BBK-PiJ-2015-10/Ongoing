package com.journaldev.spring.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAroundAspect {

	private static final Logger logger = Logger.getLogger(EmployeeAroundAspect.class);
	
	@Around("execution(* com.journaldev.spring.model.Employee.getName())")
	public Object employeeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Before invoking getName() method");
		logger.info("Before invoking getName() method");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e){
			e.printStackTrace();
		}
		System.out.println("After invoking getName() method. Return value=" +value);
		logger.info("After invoking getName() method. Return value=" +value);
		return value;
	}
	
	
	
}
