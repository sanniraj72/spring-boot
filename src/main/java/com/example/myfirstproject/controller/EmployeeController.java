package com.example.myfirstproject.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.myfirstproject.model.Employee;
import com.example.myfirstproject.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public List<Employee> redirectTo() {
		return service.getAllEmployee();
	}
	
	@RequestMapping(value =  "/employee/all", method = RequestMethod.GET)
	public List<Employee> getAll() {
		return service.getAllEmployee();
	}
	
	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		service.add(employee);
	}
	
	@RequestMapping(value = "/employee/delete/{id}", method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String id) {
		service.delete(new ObjectId(id));
	}
	
	@RequestMapping(value = "/employee/get/{id}", method = RequestMethod.GET)
	public Employee getEmployee(@PathVariable String id) {
		return service.get(new ObjectId(id));
	}
}
