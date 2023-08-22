package com.darrelasandbox._09_thymeleaf_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// We have Thymeleaf dependency in Maven POM
// Spring Boot will auto-configure to use Thymeleaf
// `src/main/resources/templates/hello_world.html`
@Controller
public class DemoController {
  @GetMapping("/hello")
  public String sayHello(Model theModel) {
    theModel.addAttribute("theDate", new java.util.Date());
    return "hello_world";
  }
}