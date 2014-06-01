package be.test.serviceClient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.manager.model.Hello;
import be.service.UserService;

public class Test {

	public static void main(String[] args) {
		
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"context/spring.xml");
 
		UserService userService  = (UserService) context.getBean("userService");
		try {
			userService.loginUser("Ter");
			System.out.println("hi ");
		} catch (Exception e) {
					e.printStackTrace();
		}
	}

}
