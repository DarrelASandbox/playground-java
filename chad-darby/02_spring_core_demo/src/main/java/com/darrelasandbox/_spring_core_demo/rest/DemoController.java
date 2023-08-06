package com.darrelasandbox._spring_core_demo.rest;

import com.darrelasandbox._spring_core_demo.common.Coach;
import com.darrelasandbox._spring_core_demo.common.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  private Coach myCoach;
  private Coach anotherCoach;
  private FortuneService fortuneService;

  @Autowired // Constructor Injection
  public DemoController(@Qualifier("aquatic") Coach theCoach) {
    myCoach = theCoach;
  }

  // Default scope is singleton
  // All dependency injections for the bean will reference the SAME bean
  // The constructor below is for prototype scope
  // Using the same qualifier twice in the same constructor is unconventional.
  // While it demonstrates the behavior of the prototype scope well, in real-world
  // applications, it's rare to inject two instances of the same bean into the
  // same component like this.
  // @Autowired
  // public DemoController(@Qualifier("baseballCoach") Coach theCoach,
  // @Qualifier("baseballCoach") Coach theAnotherCoach) {
  // myCoach = theCoach;
  // anotherCoach = theAnotherCoach;
  // }

  @Autowired // Setter Injection
  public void setFortuneService(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  @GetMapping("/daily-workout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

  @GetMapping("/check")
  public String check() {
    if (myCoach == anotherCoach)
      return "Comparing beans: myCoach == anotherCoach. Hence, it is a singleton";
    else
      return "Comparing beans: myCoach != anotherCoach. Hence, it is not a singleton";
  }

  @GetMapping("/daily-fortune")
  public String getDailyFortune() {
    return fortuneService.getFortune();
  }
}
