package com.example.myfirstproject.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.myfirstproject.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, ObjectId> {

}
