package be.test.serviceClient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.manager.model.Hello;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"context/spring.xml");
 
		Hello obj = (Hello) context.getBean("hello");
		obj.printHello();
	}

}
