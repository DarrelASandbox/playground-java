package com.darrelasandbox._11_spring_mvc_crud.service;

import java.util.List;

import com.darrelasandbox._11_spring_mvc_crud.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int theId);

	void save(Employee theEmployee);

	void deleteById(int theId);

}
