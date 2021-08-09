package com.prathamesh.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Table")
public class Employee {

	@Id
	private String empId;
	private String empName;
	private String empDesg;
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDesg=" + empDesg + "]";
	}
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empDesg
	 */
	public String getEmpDesg() {
		return empDesg;
	}
	/**
	 * @param empDesg the empDesg to set
	 */
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empId, String empName, String empDesg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesg = empDesg;
	}
	
	
}
