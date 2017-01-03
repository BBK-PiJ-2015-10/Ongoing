package di.case10;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;


public class HelloWorldFromSpringWithDIXMLFileWithAutoScanning {

	public static void main(String[] args) throws Exception {
		
		BeanFactory factory = getBeanFactory();
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		mr.render();

	}
	
	private static BeanFactory getBeanFactory() throws Exception {
		
		String XMLFileAddress = "/di/case10/dixml.xml";		
		BeanFactory factory = new ClassPathXmlApplicationContext(XMLFileAddress);
		return factory;
		
	}

}
