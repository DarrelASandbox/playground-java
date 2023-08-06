- [About The Project](#about-the-project)
  - [Course Outline](#course-outline)
- [Spring Boot Overview](#spring-boot-overview)
  - [Spring Boot Solution](#spring-boot-solution)
  - [Spring Boot and Spring](#spring-boot-and-spring)
  - [Spring Initializr](#spring-initializr)
  - [Spring Boot Embedded Server](#spring-boot-embedded-server)
  - [Deploying Spring Boot Apps](#deploying-spring-boot-apps)
  - [Spring Boot FAQ](#spring-boot-faq)
  - [Goal of Spring](#goal-of-spring)
- [Maven](#maven)
  - [Key Concepts](#key-concepts)

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

- [Spring Boot Docs](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-help)
- [Spring Projects](https://spring.io/projects/)
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

## Goal of Spring

- Lightweight development with Java POJOs (Plain-Old-Java-Objects)
- Dependency injection to promote loose coupling
- Declarative programming with Aspect-Oriented-Programming (AOP)
- Minimize boilerplate Java code
- **Core Container**: Factory for creating beans & manage bean dependencies
  - Beans
  - Core
  - SpEL
  - Context
- **Infrastructure**:
  - Add functionality to objects declaratively
    - Logging
    - Security
    - Transactions
  - AOP
  - Aspects
  - Instrumentation: Java agents to remotely monitor your app with JMX (Java Management Extension)
  - Messaging
- **Data Access Layer**:
  - JDBC Helper Classes
  - ORM: Integration with Hibernate and JPA
  - Transactions: Makes heavy use of AOP behind the scenes
  - OXM
  - JMS:
    - Java Message Service
    - For sending async messages to a message broker
    - Spring provides helper classes for JMS
- **Web Layer**: All web related classes
  - Servlet
  - WebSocket
  - Web
- **Test Layer**: Supports Test-Driven-Development (TDD), mock objects and out-of-container testing
  - Unit
  - Integration
  - Mock

&nbsp;

# Maven

- Maven is a Project Management tool
- Most popular use of Maven is for build management and dependencies
- When you build and run your app ...
  - Maven will handle class / build path for you
  - Based on config file, Maven will add JAR files accordingly
- Provides a standard directory structure

|     Directory      |                                 Description                                  |
| :----------------: | :--------------------------------------------------------------------------: |
|   src/main/java    |                            Your Java source code                             |
| src/main/resources |                  Properties / config files used by your app                  |
|  src/main/webapp   | JSP files and web config files</br> other web assets (images, css, js, etc)  |
|      src/test      |                       Unit testing code and properties                       |
|       target       | Destination directory for compiled code.</br> Automatically created by Maven |

## Key Concepts

- **Project Object Model file**: POM file
- **Project Coordinates**: uniquely identify a project
  - **Elements**:
    - **Group ID**:
      - Name of company, group, or organization.
      - Convention is to use reverse domain name: com.darrelasandbox
    - **Artifact ID**: Name for this project: hello_world
    - **Version**:
      - A specific release version like: 1.0, 1.6, 2.0 ...
      - If project is under active development then: 1.0-SNAPSHOT
      - Best practice is to include the version (repeatable builds)
  - **Dependency Coordinates**: GAV
    - **Option 1**: Visit the project page (spring.io, hibernate.org etc)
    - **Option 2**: Visit https://central.sonatype.com/ (easiest approach)
- **Maven Wrapper files**
  - Requires the installation of Maven
  - **`mvnw.cmd`**: `mvnw clean compile test`
  - **`mvnw.sh`**: `./mvnw clean compile test`
- **[`application.properties`](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties)**:
  - `server.port=8585`
  - `coach.name=Micky Mouse`
- **`static`** directory:
  - Do not use the `src/main/webapp` directory if your application is packaged as a JAR.
  - Although this is a standard Maven directory, it works only with WAR packaging.
  - It is silently ignored by most build tools if you generate a JAR.
- **`Templates`** directory:
  - Spring Boot includes auto-configuration for following template engines
    - FreeMarker
    - Thymeleaf
    - Mustache
- **Spring Boot Starters**:
  - [A curated list of Maven dependencies](https://mvnrepository.com/search?q=spring-boot-starter)
  - A collection of dependencies grouped together
  - Tested and verified by the Spring Development team
  - Makes it much easier for the developer to get started with Spring
  - Reduces the amount of Maven configuration
  - **Maven for Java** (VS Code extension)
    - `EXPLORER` sidebar -> `MAVEN` tab -> `Dependencies`
  - Benefits of the Spring Boot Starter Parent
    - Default Maven configuration: Java version, UTF-encoding etc
    - Dependency management
    - Use version on parent only
      - **spring-boot-starter-\*** dependencies inherit version from parent
    - Default configuration of Spring Boot plugin
- **CLI**
  - `java -jar 01-hello-word.jar`
  - **Without Maven installation**: `mvnw spring-boot:run`
  - **With Maven installation**:
    - `mvn clean compile test`
    - `mvn package`
    - `mvn spring-boot:run`
