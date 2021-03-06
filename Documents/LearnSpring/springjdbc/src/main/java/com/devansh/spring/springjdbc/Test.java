package com.devansh.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/devansh/spring/springjdbc/propconfig.xml");
		JdbcTemplate jd = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";
		int res = jd.update(sql, new Integer(1), "Devansh", "Tiwari");
		System.out.println("Number of records inserted are :" + res);
	}
}
