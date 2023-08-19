package com.darrelasandbox._06_rest_crud_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darrelasandbox._06_rest_crud_jpa.dao.EmployeeRepository;
import com.darrelasandbox._06_rest_crud_jpa.entity.Employee;

// Delegate the calls to the DAO
@Service
public class EmployeeServiceImpl implements EmployeeService {

  private EmployeeRepository employeeRepository;

  // Setup construction injection
  @Autowired
  public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
    employeeRepository = theEmployeeRepository;
  }

  @Override
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }

  // In Java, `Optional` is a container object that may
  // or may not contain a non-null value.
  // It's often used to avoid null references and explicitly represent the idea
  // that a value might be absent.
  @Override
  public Employee findById(int theId) {
    return employeeRepository.findById(theId)
        .orElseThrow(() -> new RuntimeException("Did not find employee id: " + theId));
  }

  // Removed `@Transactional`
  // Handles by Spring Data JPA
  @Override
  public Employee save(Employee theEmployee) {
    return employeeRepository.save(theEmployee);
  }

  // Removed `@Transactional`
  @Override
  public void deleteById(int theId) {
    employeeRepository.deleteById(theId);
  }
}
