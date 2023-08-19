package com.darrelasandbox._04_rest_crud.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// `@ControllerAdvice` is similar to an interceptor / filter
// Pre-process requests to controllers
// Post-process responses to handle exceptions
// Perfect for global exception handling
// Real-time use of AOP
@ControllerAdvice
public class StudentRestExceptionHandler {
  // Add an exception handler method using `@ExceptionHandler`
  @ExceptionHandler
  public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
    StudentErrorResponse error = new StudentErrorResponse(
        HttpStatus.NOT_FOUND.value(), exc.getMessage(), System.currentTimeMillis());
    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
  }

  // Add an exception handler method to catch all other exceptions
  @ExceptionHandler
  public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
    StudentErrorResponse error = new StudentErrorResponse(
        HttpStatus.BAD_REQUEST.value(), exc.getMessage(), System.currentTimeMillis());
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }
}
