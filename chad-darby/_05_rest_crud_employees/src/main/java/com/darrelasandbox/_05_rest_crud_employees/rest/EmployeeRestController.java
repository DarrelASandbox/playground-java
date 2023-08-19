package com.darrelasandbox._05_rest_crud_employees.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darrelasandbox._05_rest_crud_employees.dao.EmployeeDAO;
import com.darrelasandbox._05_rest_crud_employees.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
  private EmployeeDAO employeeDAO;

  // Quick and dirty: inject employee dao (use constructor injection)
  public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
    employeeDAO = theEmployeeDAO;
  }

  @GetMapping("/employees")
  public List<Employee> findAll() {
    return employeeDAO.findAll();
  }
}
