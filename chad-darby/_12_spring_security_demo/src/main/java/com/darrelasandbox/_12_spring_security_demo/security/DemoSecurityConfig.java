package com.darrelasandbox._12_spring_security_demo.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

  // Inject data source
  // Auto-configured by Spring Boot
  @Bean
  public UserDetailsManager userDetailsManager(DataSource dataSource) {
      // Tell Spring Security to use JDBC authentication with our data source
      return new JdbcUserDetailsManager(dataSource);
  }

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

    http.authorizeHttpRequests(configurer -> configurer
        .requestMatchers("/").hasRole("EMPLOYEE")
        .requestMatchers("/leaders/**").hasRole("MANAGER")
        .requestMatchers("/systems/**").hasRole("ADMIN")
        .anyRequest().authenticated())
        .formLogin(form -> form
            .loginPage("/showMyLoginPage")
            .loginProcessingUrl("/authenticateTheUser")
            .permitAll())
        .logout(logout -> logout.permitAll())
        .exceptionHandling(configurer -> configurer.accessDeniedPage("/access-denied"));

    return http.build();
  }
}
