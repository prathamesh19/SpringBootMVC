package com.prathamesh.service;

import java.util.List;

import com.prathamesh.model.Employee;

public interface IEmployeeService {

	
	public String saveEmployee(Employee employee);
	public Employee getEmployee(String id);
	public List<Employee> getAllEmployees();
	public void deleteEmployee(String id);
	public void updateEmployee(Employee employee);
	public boolean isEmployeeExists(String id);
}
