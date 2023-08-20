package com.darrelasandbox._08_rest_security_employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darrelasandbox._08_rest_security_employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code LOL!

}
