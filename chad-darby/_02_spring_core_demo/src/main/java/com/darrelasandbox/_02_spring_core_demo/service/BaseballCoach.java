package com.darrelasandbox._02_spring_core_demo.service;

// import org.springframework.beans.factory.config.ConfigurableBeanFactory;
// import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.darrelasandbox._02_spring_core_demo.common.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component // This annotation marks the class as a Spring bean
// @Primary // If not using @Qualifier annotation
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach {

  // To test lazy initialization
  public BaseballCoach() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println("In doMyStartupStuff() - @PostConstruct " + getClass().getSimpleName());
  }

  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println("In doMyCleanupStuff() - @PreDestroy " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Spend 30 minutes in batting practice.";
  }
}
