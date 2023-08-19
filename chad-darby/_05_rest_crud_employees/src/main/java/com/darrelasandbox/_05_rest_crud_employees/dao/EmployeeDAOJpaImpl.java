package com.darrelasandbox._05_rest_crud_employees.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darrelasandbox._05_rest_crud_employees.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

  // Define field for `entityManager`
  private EntityManager entityManager;

  // Setup constructor injection
  // `entityManager` is automatically created by Spring Boot
  @Autowired
  public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
    entityManager = theEntityManager;
  }

  @Override
  public List<Employee> findAll() {
    TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
    List<Employee> employees = theQuery.getResultList();
    return employees;
  }
}
