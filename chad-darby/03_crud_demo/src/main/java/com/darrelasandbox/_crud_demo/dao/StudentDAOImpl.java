package com.darrelasandbox._crud_demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.darrelasandbox._crud_demo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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

  @Override
  public Student findById(Integer id) {
    return entityManager.find(Student.class, id);
  }

  // All JPQL syntax is based on entity name and entity fields
  // `Student` is the Name of JPA Entity (Class Name)
  // It is not the name of the database table
  // `lastName` is the field of JPA entity
  @Override
  public List<Student> findAll() {
    TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName", Student.class);
    return theQuery.getResultList();
  }

  // JPQL Named Parameters are prefixed with a colon `:`
  @Override
  public List<Student> findByLastName(String theLastName) {
    TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class);

    theQuery.setParameter("theData", theLastName);
    return theQuery.getResultList();
  }

  @Override
  @Transactional
  public void update(Student theStudent) {
    entityManager.merge(theStudent);
  }

  @Override
  @Transactional
  public void delete(Integer id) {
    Student theStudent = entityManager.find(Student.class, id);
    entityManager.remove(theStudent);
  }

  @Override
  @Transactional
  public int deleteAll() {
    int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();
    return numRowsDeleted;
  }
}