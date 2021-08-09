package com.prathamesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prathamesh.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String>{

}
