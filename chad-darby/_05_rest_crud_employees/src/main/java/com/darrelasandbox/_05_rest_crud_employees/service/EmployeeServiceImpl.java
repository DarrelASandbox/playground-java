package com.darrelasandbox._05_rest_crud_employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darrelasandbox._05_rest_crud_employees.dao.EmployeeDAO;
import com.darrelasandbox._05_rest_crud_employees.entity.Employee;

import jakarta.transaction.Transactional;

// Delegate the calls to the DAO
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

  @Override
  public Employee findById(int theId) {
    return employeeDAO.findById(theId);
  }

  // Apply `@Transactional` at Service layer
  // Useful when modifying the data in database
  @Transactional
  @Override
  public Employee save(Employee theEmployee) {
    return employeeDAO.save(theEmployee);
  }

  @Transactional
  @Override
  public void deleteById(int theId) {
    employeeDAO.deleteById(theId);
  }
}
