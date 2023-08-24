package com.darrelasandbox._12_spring_security_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @GetMapping("/showMyLoginPage")
  public String showMyLoginPage() {
    // `plain-login` or `fancy-login`
    return "fancy-login";
  }

  // add request mapping for /access-denied
  @GetMapping("/access-denied")
  public String showAccessDenied() {
    return "access-denied";
  }
}
