package com.jdbcexample.dao;

import java.util.List;

import com.jdbcexample.model.Employee;

public interface EmployeeDao {

	 int save(Employee employee);
	 int update(Employee employee , int id);
	int  delete(int id);
	List<Employee> getAll();
	Employee getById(int id);
}
