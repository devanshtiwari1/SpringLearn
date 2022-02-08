package com.devansh.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
        System.out.println("Employee Id is:" + emp.getId());
        System.out.println("Employee Name is:" + emp.getName());
	}
}
