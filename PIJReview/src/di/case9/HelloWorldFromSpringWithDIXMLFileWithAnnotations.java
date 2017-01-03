package di.case9;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

public class HelloWorldFromSpringWithDIXMLFileWithAnnotations {

	public static void main(String[] args) throws Exception {
		
		BeanFactory factory = getBeanFactory();
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		mr.render();

	}
	
	private static BeanFactory getBeanFactory() throws Exception {
		
		String XMLFileAddress = "/di/case9/dixml.xml";		
		BeanFactory factory = new ClassPathXmlApplicationContext(XMLFileAddress);
		return factory;
		
	}

}
