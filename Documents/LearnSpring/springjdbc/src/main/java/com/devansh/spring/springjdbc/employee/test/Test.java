package com.devansh.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.devansh.spring.springjdbc.employee.entity.Employee;
import com.devansh.spring.springjdbc.employee.entity.EmployeeDAO;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/devansh/spring/springjdbc/employee/test/propconfig.xml");
		EmployeeDAO jd = (EmployeeDAO) context.getBean("employeeDao");
		Employee emp = new Employee();
		emp.setId(3);
		emp.setFirstName("dev");
		emp.setLastName("nand");
		int res = jd.create(emp);
		System.out.println("Number of records inserted are :" + res);
	}
}
