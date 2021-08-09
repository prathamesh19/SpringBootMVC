package com.prathamesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.prathamesh.model.Employee;
import com.prathamesh.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	@GetMapping("/reg")
	public String showRegPage(Model model) {
		model.addAttribute("employee", new Employee());
		return "Register";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee employee, Model model) {
		String id = service.saveEmployee(employee);
		model.addAttribute("message","Employee With Id: ''"+id+"'' Saved Successfully !");
		model.addAttribute("employee", new Employee());
		return "Register";
	}
	
	@GetMapping("/all")
	public String getAllEmployees(Model model) {
		List<Employee> list = service.getAllEmployees();
		model.addAttribute("list", list);
		return "Data";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam String empId) {
		service.deleteEmployee(empId);
		return "redirect:all";
	}
	
	@GetMapping("/edit")
	public String showEdit(@RequestParam String empId, Model model) {
		Employee employee = service.getEmployee(empId);
		model.addAttribute("employee", employee);
		return "Edit";
	}
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee employee) {
		service.updateEmployee(employee);
		return "redirect:all";
	}
}
