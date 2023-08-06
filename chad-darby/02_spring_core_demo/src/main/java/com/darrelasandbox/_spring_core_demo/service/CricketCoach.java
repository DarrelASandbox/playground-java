package com.darrelasandbox._spring_core_demo.service;

import org.springframework.stereotype.Component;

import com.darrelasandbox._spring_core_demo.common.Coach;

@Component // This annotation marks the class as a Spring bean
public class CricketCoach implements Coach {

  // To test lazy initialization
  public CricketCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes!!";
  }
}
