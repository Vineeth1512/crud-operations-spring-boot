package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository repository;

	public List<Employee> getAllEmployes() {

		return repository.findAll();
	}

	public Employee addEmployee(Employee emp) {

		return repository.save(emp);
	}

	public Employee updateEmployee(Employee emp) {

		return repository.save(emp);
	}

	public void deleteEmployee(int id) {

		repository.deleteById(id);

	}

	public Employee getById(int id) {

		return repository.findById(id).orElse(null);
	}

}
