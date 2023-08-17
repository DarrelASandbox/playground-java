package com.darrelasandbox._02_spring_core_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.darrelasandbox._02_spring_core_demo.common.Coach;
import com.darrelasandbox._02_spring_core_demo.service.SwimCoach;

@Configuration
public class SportsConfig {
  @Bean("aquatic") // Custom Bean ID
  public Coach swimCoach() {
    return new SwimCoach();
  }
}
