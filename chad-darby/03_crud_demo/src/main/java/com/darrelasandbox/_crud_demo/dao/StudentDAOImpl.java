package com.darrelasandbox._crud_demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darrelasandbox._crud_demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

// Specialize annotation for repositories
// Supports component scanning
// Translate JDBC exceptions
@Repository
public class StudentDAOImpl implements StudentDAO {

  private EntityManager entityManager;

  @Autowired
  public StudentDAOImpl(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  @Override
  @Transactional
  public void save(Student theStudent) {
    entityManager.persist(theStudent);
  }

}