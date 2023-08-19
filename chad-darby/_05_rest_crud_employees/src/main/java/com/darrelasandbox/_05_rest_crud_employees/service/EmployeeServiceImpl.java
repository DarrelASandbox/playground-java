package com.darrelasandbox._05_rest_crud_employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darrelasandbox._05_rest_crud_employees.dao.EmployeeDAO;
import com.darrelasandbox._05_rest_crud_employees.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeDAO employeeDAO;

  // Setup construction injection
  @Autowired
  public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
    employeeDAO = theEmployeeDAO;
  }

  @Override
  public List<Employee> findAll() {
    return employeeDAO.findAll();
  }
}
