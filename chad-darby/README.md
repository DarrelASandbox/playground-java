- [About The Project](#about-the-project)
  - [Course Outline](#course-outline)
- [Spring Boot Overview](#spring-boot-overview)
  - [Spring Boot Solution](#spring-boot-solution)
  - [Spring Boot and Spring](#spring-boot-and-spring)
  - [Spring Initializr](#spring-initializr)
  - [Spring Boot Embedded Server](#spring-boot-embedded-server)
  - [Deploying Spring Boot Apps](#deploying-spring-boot-apps)
  - [Spring Boot FAQ](#spring-boot-faq)

&nbsp;

# About The Project

- Spring Boot 3, Spring 6 & Hibernate for Beginners
- Spring Boot 3: Learn Spring 6, Spring REST API, Spring MVC, Spring Security, Thymeleaf, JPA & Hibernate
- [GitHub Repo](https://github.com/darbyluv2code/spring-boot-3-spring-6-hibernate-for-beginners)

## Course Outline

- Develop Spring Boot applications
- Leverage Hibernate/JPA for database access
- Develop a REST API using Spring Boot
- Create a Spring MVC app with Spring Boot
- Connect Spring Boot apps to a Database for CRUD development Apply Spring Security to control application access
- Leverage all Java configuration (no xml) and Maven

# Spring Boot Overview

## Spring Boot Solution

- Make it easier to get started with Spring development
- Minimize the amount of manual configuration
  - Perform auto-configuration based on props files and JAR classpath
- Help to resolve dependency conflicts (Maven or Gradle)
- Provide an embedded HTTP server so you can get started quickly
  - Tomcat, Jetty, Undertow, ...

## Spring Boot and Spring

- Spring Boot uses Spring behind the scenes
- Spring Boot simply makes it easier to use Spring

## Spring Initializr

- [Quickly create a starter Spring Boot project Select your dependencies](https://start.spring.io)
- Creates a Maven/Gradle project
- Import the project into your IDE
  - Eclipse, IntelliJ, NetBeans etc ...
- Or use CLI for text editor

## Spring Boot Embedded Server

- Provide an **embedded HTTP server** so you can get started quickly
  - Tomcat, Jetty, Undertow, ...
- No need to install a server separately
- JAR file includes your application code AND includes the server
  - `java -jar my_cool_app.jar`

## Deploying Spring Boot Apps

- Spring Boot apps can also be deployed in the traditional way
- Deploy **Web Application Archive** (WAR) file to an external server:
  - Tomcat, JBoss, WebSphere etc ...

## Spring Boot FAQ

- **Q:** Does Spring Boot replace Spring MVC, Spring REST etc ...?
- **A:** No. Instead, Spring Boot actually uses those technologies
- **Q:** Does Spring Boot run code faster than regular Spring code?
- **A:** No. Behind the scenes, Spring Boot uses same code of Spring Framework Remember, Spring Boot is about making it easier to get started. Minimizing configuration etc ...
