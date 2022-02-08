package com.devansh.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/devansh/spring/springcore/map/mapconfig.xml");
		Salary sal = (Salary) context.getBean("salary");
		System.out.println(sal.getId());
		System.out.println(sal.getHs());
	}

}
