package com.devansh.spring.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/devansh/spring/springcore/ref/propconfig.xml");
		Scores rank = (Scores) context.getBean("score");
		System.out.println(rank);

	}
}
