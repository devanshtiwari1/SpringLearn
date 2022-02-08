package com.devansh.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/devansh/spring/springcore/properties/propconfig.xml");
		Propertiees rank = (Propertiees) context.getBean("rank");
		System.out.println(rank);

	}
}
