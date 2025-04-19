package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.addEmployee(emp);
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		return service.getAllEmployes();
	}

	@PutMapping
	public Employee updateEmployee(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return service.getById(id);
	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
		return "Row Deleted Successfully..";
	}
}
