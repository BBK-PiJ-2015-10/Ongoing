package com.plantplaces;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyObjectFactory {
	
	public static BeanFactory getBeanFactory(){
		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		return factory;
	}
	
}
