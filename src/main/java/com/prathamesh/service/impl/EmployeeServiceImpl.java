package com.prathamesh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prathamesh.model.Employee;
import com.prathamesh.repository.EmployeeRepository;
import com.prathamesh.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public String saveEmployee(Employee employee) {
		return repository.save(employee).getEmpId();
	}
	
	@Override
	public Employee getEmployee(String id) {
		return repository.findById(id).get();
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}
	
	@Override
	public void updateEmployee(Employee employee) {
       repository.save(employee);		
	}
	
	@Override
	public void deleteEmployee(String id) {
       repository.deleteById(id);		
	}
	
	@Override
	public boolean isEmployeeExists(String id) {
		return repository.existsById(id);
	}
	
	
}
