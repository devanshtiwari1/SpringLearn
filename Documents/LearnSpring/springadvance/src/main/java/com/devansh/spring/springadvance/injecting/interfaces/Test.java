package com.devansh.spring.springadvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/devansh/spring/springadvance/injecting/interfaces/propconfig.xml");
          OrderBO bean = (OrderBO) context.getBean("bo");
          bean.placeOrder();
	}
}
