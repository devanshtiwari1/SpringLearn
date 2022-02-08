package com.devansh.spring.springjdbc.employee.entity.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.devansh.spring.springjdbc.employee.entity.Employee;
import com.devansh.spring.springjdbc.employee.entity.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {
      

	private JdbcTemplate jdbctemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int res = jdbctemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return res;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

}
