package com.devansh.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String args[])
{
	ApplicationContext context=new ClassPathXmlApplicationContext("com/devansh/spring/springcore/set/carconfig.xml");
	Cardealer deal = (Cardealer) context.getBean("cardeal");
	System.out.println(deal.getName());
	System.out.println(deal.getModels());
	
}
}
