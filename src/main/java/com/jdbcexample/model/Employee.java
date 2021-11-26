package com.jdbcexample.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Employee {
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
private String email;
private String department;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department + "]";
}

}
