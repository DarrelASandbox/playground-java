package com.darrelasandbox._08_rest_security_employee.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

// Since we defined our users here
// Spring Boot will NOT use the user/pass from the `application.properties` file
@Configuration
public class DemoSecurityConfig {

  // In-memory user details for authentication.
  @Bean
  public InMemoryUserDetailsManager userDetailsManager() {
    UserDetails john = User.builder()
        .username("john")
        .password("{noop}p")
        .roles("EMPLOYEE")
        .build();

    UserDetails mary = User.builder()
        .username("mary")
        .password("{noop}p")
        .roles("EMPLOYEE", "MANAGER")
        .build();

    UserDetails susan = User.builder()
        .username("susan")
        .password("{noop}p")
        .roles("EMPLOYEE", "MANAGER", "ADMIN")
        .build();

    return new InMemoryUserDetailsManager(john, mary, susan);
  }

}
