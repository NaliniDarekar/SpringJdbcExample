package com.jdbcexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jdbcexample.dao.EmployeeDao;
import com.jdbcexample.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeDao.getAll();
	}
	
	
	@GetMapping("/employees/{id}")
	public  Employee getEmployeeById(@PathVariable int id)
	{
		return employeeDao.getById( id);
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@RequestBody Employee employee)
	{
		return employeeDao.save(employee )+"No of rows saved to the Database";
	}
	
	
	@PutMapping("/employees/{id}")
	
		public String updateEmployee(@RequestBody Employee employee,@PathVariable int id)
		{
		return 	employeeDao.update(employee, id)+ "No of rows saved to the Database ";
		}
	
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployeeById(@PathVariable int id)
	{
		return employeeDao.delete(id)+"No of rows saved to the Database ";
	}
	}
	
	
	
	
	

