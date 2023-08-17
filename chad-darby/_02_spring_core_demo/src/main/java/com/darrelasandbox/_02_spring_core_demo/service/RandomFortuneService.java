
package com.darrelasandbox._02_spring_core_demo.service;

import com.darrelasandbox._02_spring_core_demo.common.FortuneService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomFortuneService implements FortuneService {

  // To test lazy initialization
  public RandomFortuneService() {
    System.out.println("In constructor: " + getClass().getSimpleName());
  }

  private final String[] data = {
      "Today is your lucky day!",
      "Good things come to those who wait.",
      "Beware of the unknown.",
      "Your hard work will pay off soon.",
      "A pleasant surprise awaits you."
  };

  private final Random random = new Random();

  @Override
  public String getFortune() {
    int index = random.nextInt(data.length);
    return data[index];
  }
}
