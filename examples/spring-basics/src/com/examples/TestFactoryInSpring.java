package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryInSpring {
	public static void main(String[] args) {
		// you must load the configuration file - beans.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Identifier obj = (Identifier) context.getBean("b1");  
//		EmployeeService service = (EmployeeService)context.getBean("b2");
		
		Identifier obj = (Identifier) context.getBean("aadhar");
		obj.display();
	}
}

