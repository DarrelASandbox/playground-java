package com.darrelasandbox._04_rest_crud.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darrelasandbox._04_rest_crud.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {

  private List<Student> theStudents;

  // `@PostConstruct` loads the student data only once
  // If you want to ensure the data itself is loaded once and only once, you'll
  // need to ensure that:
  // 1. The bean itself is a singleton (default in Spring).
  // 2. You don't have logic elsewhere that unintentionally reloads the data.
  // 3. If you're working in a distributed system or a cluster, each instance of
  // the application will have its own separate initialization. If you want to
  // ensure data is loaded only once across all instances, you'll need a different
  // strategy or mechanism.
  @PostConstruct
  public void loadData() {
    theStudents = new ArrayList<>();
    theStudents.add(new Student("John", "Doe"));
    theStudents.add(new Student("Marry", "Stoke"));
    theStudents.add(new Student("Tom", "Frank"));
  }

  @GetMapping("/students")
  public List<Student> getStudents() {
    return theStudents;
  }

  @GetMapping("/students/{studentId}")
  public Student getStudent(@PathVariable int studentId) {
    return theStudents.get(studentId);
  }
}
