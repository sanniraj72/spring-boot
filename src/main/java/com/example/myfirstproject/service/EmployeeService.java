package com.example.myfirstproject.service;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirstproject.model.Employee;
import com.example.myfirstproject.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonEncoding;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		Iterable<Employee> iterable = repository.findAll();
		iterable.forEach(e -> {
			employees.add(e);
		});
		return employees;
	}
	
	public void add(Employee employee) {
		repository.save(employee);
	}
	
	public void delete(ObjectId id) {
		Employee employee = repository.findById(id).get();
		if(employee != null) {
			repository.delete(employee);
		} else {
			System.out.println("Employee not found...");
		}
	}
	
	public void update(Employee employee) {
		repository.save(employee);
	}
	
	public Employee get(ObjectId id) {
		Employee employee = repository.findById(id).get();
		return employee;
	}
}
