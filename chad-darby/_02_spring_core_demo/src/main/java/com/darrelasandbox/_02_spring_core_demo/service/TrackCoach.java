package com.darrelasandbox._02_spring_core_demo.service;

import org.springframework.stereotype.Component;

import com.darrelasandbox._02_spring_core_demo.common.Coach;

@Component // This annotation marks the class as a Spring bean
public class TrackCoach implements Coach {

  // To test lazy initialization
  public TrackCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Run 50km.";
  }
}
