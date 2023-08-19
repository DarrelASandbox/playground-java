package com.darrelasandbox._06_rest_crud_jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "email")
  private String email;

  // https://openjpa.apache.org/builds/1.2.3/apache-openjpa/docs/jpa_overview_pc.html#jpa_overview_pc_no_arg
  // 1.1. Default or No-Arg Constructor
  // The JPA specification requires that all persistent classes have a no-arg
  // constructor. This constructor may be public or protected. Because the
  // compiler automatically creates a default no-arg constructor when no other
  // constructor is defined, only classes that define constructors must also
  // include a no-arg constructor.
  public Employee() {

  }

  public Employee(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // Use `Source Action` in VS Code to generate the code
  @Override
  public String toString() {
    return "Employee [id=" + id + ", firstName=" + firstName +
        ", lastName=" + lastName + ", email=" + email + "]";
  }
}
