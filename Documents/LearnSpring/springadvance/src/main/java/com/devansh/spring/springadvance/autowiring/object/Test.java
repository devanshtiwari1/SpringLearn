package com.devansh.spring.springadvance.autowiring.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/devansh/spring/springadvance/autowiring/object/propconfig.xml");
          Instructor emp1 = (Instructor) context.getBean("instructor");
          Instructor emp2 = (Instructor) context.getBean("instructor");
           System.out.println(emp1);
           System.out.println(emp2);
	}
}
