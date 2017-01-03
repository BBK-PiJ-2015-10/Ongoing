package di.case6;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

public class HelloWorldFromSpring1 {

	public static void main(String[] args) throws Exception {
		
		BeanFactory factory = getBeanFactory();
		
		MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
		MessageProvider mp = (MessageProvider) factory.getBean("provider");
		
		mr.setMessageProvider(mp);
		mr.render();

	}
	
	private static BeanFactory getBeanFactory() throws Exception {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(factory);
		
		Properties props = new Properties();
		String address = "C:\\Users\\YasserAlejandro\\SDP\\Ongoing\\PIJReview\\src\\di\\case6\\bean.properties";
		props.load(new FileInputStream(address));
		rdr.registerBeanDefinitions(props);
		
		return factory;
		
	}

}
