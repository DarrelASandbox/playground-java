package com.darrelasandbox._06_rest_crud_jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darrelasandbox._06_rest_crud_jpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  // Spring Data JPA provides the interface: JpaRepository
  // Exposes methods (some by inheritance from parents)
  // No need for implementation class
  // Spring Data JPA provides all of the basic CRUD features
}
