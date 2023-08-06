package com.darrelasandbox._hello_world.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
  // @Value("${coach.name}")
  // private String coachName;

  // @Value("${team.name}")
  // private String teamName;

  // @GetMapping("/")
  // public String sayHello() {
  // return "Hello World!";
  // }

  @Value("${coach.name}")
  private String coachName;

  @Value("${team.name}")
  private String teamName;

  @GetMapping("/")
  public String sayHello() {
    return String.format("Hello, my name is %1$s and I have been supporting my team \"%2$s\" for %3$d years", coachName,
        teamName, 10);
  }

  // Testing `spring-boot-devtools` dependency in `pom.xml`
  @GetMapping("/workout")
  public String getDailyWorkout() {
    return "Running out a hard 5k!!!!!!";
  }
}
