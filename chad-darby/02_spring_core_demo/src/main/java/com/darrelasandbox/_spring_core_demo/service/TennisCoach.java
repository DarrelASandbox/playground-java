package com.darrelasandbox._spring_core_demo.service;

import org.springframework.stereotype.Component;

import com.darrelasandbox._spring_core_demo.common.Coach;

@Component // This annotation marks the class as a Spring bean
public class TennisCoach implements Coach {

  // To test lazy initialization
  public TennisCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice your backhand volley for 2 hours.";
  }
}
