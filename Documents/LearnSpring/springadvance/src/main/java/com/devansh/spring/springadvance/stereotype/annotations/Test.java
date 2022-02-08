package com.devansh.spring.springadvance.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/devansh/spring/springadvance/stereotype/annotations/propconfig.xml");
          Instructor emp = (Instructor) context.getBean("instructor");
           System.out.println(emp);
	}
}
