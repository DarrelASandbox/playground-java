package com.darrelasandbox._05_rest_crud_employees.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darrelasandbox._05_rest_crud_employees.entity.Employee;
import com.darrelasandbox._05_rest_crud_employees.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

  private EmployeeService employeeService;

  @Autowired
  public EmployeeRestController(EmployeeService theEmployeeService) {
    employeeService = theEmployeeService;
  }

  @GetMapping("/employees")
  public List<Employee> findAll() {
    return employeeService.findAll();
  }
}
