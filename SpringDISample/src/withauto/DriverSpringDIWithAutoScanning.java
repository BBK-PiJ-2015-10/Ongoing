package withauto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverSpringDIWithAutoScanning {

	public static void main(String[] args) {
		
		BeanFactory factory = getBeanFactory();
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		mr.render();
		
		System.out.println("This better work again and again");
		

	}
	
	private static BeanFactory getBeanFactory() {
		
		//create a bean factory from beans.xml
		BeanFactory factory = new ClassPathXmlApplicationContext("withauto/beans.xml");
		return factory;
	}

}
