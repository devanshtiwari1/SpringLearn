package com.devansh.spring.springadvance.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/devansh/spring/springadvance/autowiring/annotation/propconfig.xml");
           Employee emp = (Employee) context.getBean("employee");
           System.out.println(emp);
	}
}
