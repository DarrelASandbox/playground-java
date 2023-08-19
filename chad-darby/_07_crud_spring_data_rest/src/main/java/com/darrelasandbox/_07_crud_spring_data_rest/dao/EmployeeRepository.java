package com.darrelasandbox._07_crud_spring_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.darrelasandbox._07_crud_spring_data_rest.entity.Employee;

// Change `/employees` to `/members`
// @RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  // Spring Data JPA provides the interface: JpaRepository
  // Exposes methods (some by inheritance from parents)
  // No need for implementation class
  // Spring Data JPA provides all of the basic CRUD features
}
