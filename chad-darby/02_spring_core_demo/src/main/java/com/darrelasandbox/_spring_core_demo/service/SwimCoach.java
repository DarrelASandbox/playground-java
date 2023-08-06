package com.darrelasandbox._spring_core_demo.service;

import com.darrelasandbox._spring_core_demo.common.Coach;

public class SwimCoach implements Coach {

  // To test lazy initialization
  public SwimCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Swim from Japan to USA.";
  }
}