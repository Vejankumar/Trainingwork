package com.pack.springmvc.dao;

import java.util.List;

import com.pack.springmvc.model.Employee;

public interface EmployeeDAO {

	public void insert(Employee employee);
	public int update (Employee employee);
	public int delete (int id);
	public List<Employee> listAll();
	public Employee findById(int id);	
}
