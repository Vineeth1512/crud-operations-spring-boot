package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee emp);

	Employee updateEmployee(Employee emp);

	void deleteEmployee(int id);

	Employee getById(int id);

	List<Employee> getAllEmployes();
}
