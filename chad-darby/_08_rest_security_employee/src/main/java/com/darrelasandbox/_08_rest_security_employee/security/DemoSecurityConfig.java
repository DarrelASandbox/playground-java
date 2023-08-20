package com.darrelasandbox._08_rest_security_employee.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

// Since we defined our users here
// Spring Boot will NOT use the user/pass from the `application.properties` file
@Configuration
public class DemoSecurityConfig {

  /*
   * // Comment out for JDBC authentication
   * // In-memory user details for authentication.
   * 
   * @Bean
   * public InMemoryUserDetailsManager userDetailsManager() {
   * UserDetails john = User.builder()
   * .username("john")
   * .password("{noop}p")
   * .roles("EMPLOYEE")
   * .build();
   * 
   * UserDetails mary = User.builder()
   * .username("mary")
   * .password("{noop}p")
   * .roles("EMPLOYEE", "MANAGER")
   * .build();
   * 
   * UserDetails susan = User.builder()
   * .username("susan")
   * .password("{noop}p")
   * .roles("EMPLOYEE", "MANAGER", "ADMIN")
   * .build();
   * 
   * return new InMemoryUserDetailsManager(john, mary, susan);
   * }
   */

  // Using JDBC (Hardcoded users are not required anymore)
  @Bean
  public UserDetailsManager userDetailsManager(DataSource dataSource) {
    // return new JdbcUserDetailsManager(dataSource);

    // Security Schema Customization
    JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);

    // Define query to retrieve a user by username
    jdbcUserDetailsManager.setUsersByUsernameQuery(
        "SELECT user_id, pw, active FROM members WHERE user_id=?");

    // Define query to retrieve the authorities/ roles by username
    jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(
        "SELECT user_id, role FROM roles WHERE user_id=?");

    return jdbcUserDetailsManager;
  }

  // Restricting access to roles
  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(
        configure -> configure
            .requestMatchers(HttpMethod.GET, "/api/employees")
            .hasRole("EMPLOYEE")
            .requestMatchers(HttpMethod.GET, "/api/employees/**")
            .hasRole("EMPLOYEE")
            .requestMatchers(HttpMethod.POST, "/api/employees")
            .hasRole("MANAGER")
            .requestMatchers(HttpMethod.PUT, "/api/employees")
            .hasRole("MANAGER")
            .requestMatchers(HttpMethod.DELETE, "/api/employees/**")
            .hasRole("ADMIN"));

    // use HTTP basic authentication
    http.httpBasic(Customizer.withDefaults());

    // disable CSRF
    http.csrf(csrf -> csrf.disable());
    return http.build();
  }
}
