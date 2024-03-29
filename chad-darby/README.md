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
  - [Project Structure](#project-structure)
  - [Project Object Model file (POM) file](#project-object-model-file-pom-file)
    - [Project Coordinates](#project-coordinates)
    - [Spring Boot Starters](#spring-boot-starters)
- [Spring Core](#spring-core)
  - [Inversion of Control (IoC)](#inversion-of-control-ioc)
  - [Dependency Injection](#dependency-injection)
  - [Spring for Enterprise applications](#spring-for-enterprise-applications)
  - [Component Scanning](#component-scanning)
  - [Bean Scopes](#bean-scopes)
  - [Bean Lifecycle](#bean-lifecycle)
  - [Special Note about Prototype Scope - Destroy Lifecycle Method and Lazy Init](#special-note-about-prototype-scope---destroy-lifecycle-method-and-lazy-init)
  - [Configuring Beans with Java Code](#configuring-beans-with-java-code)
- [Hibernate/JPA CRUD](#hibernatejpa-crud)
  - [JPA Annotation](#jpa-annotation)
  - [Data Access Object (DAO) Design Pattern](#data-access-object-dao-design-pattern)
- [REST CRUD](#rest-crud)
  - [Paypal](#paypal)
  - [GitHub Developer](#github-developer)
  - [SalesForce](#salesforce)
- [Application Architecture](#application-architecture)
  - [Create DAO interface in Spring Boot](#create-dao-interface-in-spring-boot)
  - [Add a Service Layer](#add-a-service-layer)
  - [Spring Data](#spring-data)
- [REST API Security](#rest-api-security)
  - [Cross-Site Request Forgery (CSRF)](#cross-site-request-forgery-csrf)
  - [JDBC Authentication](#jdbc-authentication)
  - [BCrypt](#bcrypt)
- [Spring MVC](#spring-mvc)
  - [Thymeleaf](#thymeleaf)
  - [Validation](#validation)
- [Spring MVC Security](#spring-mvc-security)
- [JPA/ Hibernate Advanced Mappings](#jpa-hibernate-advanced-mappings)
  - [One-to-One Mapping (Unidirectional)](#one-to-one-mapping-unidirectional)
  - [One-to-One Mapping (Bidirectional)](#one-to-one-mapping-bidirectional)
  - [One-to-Many Mapping (Bidirectional)](#one-to-many-mapping-bidirectional)
  - [One-to-Many Mapping (Unidirectional)](#one-to-many-mapping-unidirectional)
  - [Many-to-Many Mapping](#many-to-many-mapping)
- [Aspect-Oriented Programming (AOP)](#aspect-oriented-programming-aop)
  - [Cross-Cutting Concerns](#cross-cutting-concerns)
    - [How to Handle Cross-Cutting Concerns](#how-to-handle-cross-cutting-concerns)
  - [`@Before` Advice Type](#before-advice-type)
  - [Pointcut Expressions](#pointcut-expressions)
  - [Pointcut Declaration](#pointcut-declaration)
  - [Control Order](#control-order)
  - [Reading Method Arguments with JoinPoints](#reading-method-arguments-with-joinpoints)
  - [`@AfterReturning` Advice Type](#afterreturning-advice-type)
  - [`@AfterThrowing` Advice Type](#afterthrowing-advice-type)
  - [`@After` Advice Type](#after-advice-type)
  - [`@Around` Advice Type](#around-advice-type)
- [Integrating AOP with Spring MVC CRUD app](#integrating-aop-with-spring-mvc-crud-app)

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

## Project Structure

- **[`application.properties`](https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html#appendix.application-properties)**
- Provides a standard directory structure

|     Directory      |                                 Description                                  |
| :----------------: | :--------------------------------------------------------------------------: |
|   src/main/java    |                            Your Java source code                             |
| src/main/resources |                  Properties / config files used by your app                  |
|  src/main/webapp   | JSP files and web config files</br> other web assets (images, css, js, etc)  |
|      src/test      |                       Unit testing code and properties                       |
|       target       | Destination directory for compiled code.</br> Automatically created by Maven |

- **`static`** directory:
  - Do not use the `src/main/webapp` directory if your application is packaged as a JAR.
  - Although this is a standard Maven directory, it works only with WAR packaging.
  - It is silently ignored by most build tools if you generate a JAR.
- **`Templates`** directory:
  - Spring Boot includes auto-configuration for following template engines
    - FreeMarker
    - Thymeleaf
    - Mustache
- **CLI**
  - `java -jar 01-hello-word.jar`
  - **Without Maven installation**:
    - **Maven Wrapper files**
    - `mvnw spring-boot:run`
  - **With Maven installation**:
    - `mvn clean compile test`
    - `mvn package`
    - `mvn spring-boot:run`

## Project Object Model file (POM) file

### Project Coordinates

- Uniquely identify a project
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

### Spring Boot Starters

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

&nbsp;

# Spring Core

- **Overview**: Is the foundational building block of the Spring ecosystem. It provides the essential functionality around which the vast array of Spring's sub-projects are built. Here's a broad overview:
  1. **Inversion of Control (IoC)**:
     - At the heart of Spring Core is the concept of Inversion of Control (IoC), a design principle where the control of object creation, initialization, and configuration is handed over to an external system (in this case, the Spring container) rather than the object itself or its direct clients.
     - The Spring container is responsible for managing the lifecycle and configuration of application objects (beans).
  2. **Dependency Injection (DI)**:
     - Dependency Injection (DI) is a design pattern and a core concept in Spring. It's a technique to achieve IoC.
     - DI allows dependencies of a component (e.g., a service or a repository) to be provided externally, making the component more decoupled and testable.
     - In Spring, DI can be achieved using constructors, setters, or field injection, guided by annotations like `@Autowired`.
  3. **Spring Bean Lifecycle**:
     - Beans are the objects that form the backbone of a Spring application. They are managed by the Spring IoC container.
     - The Spring container controls the lifecycle of beans, from instantiation to destruction, providing hooks (like `@PostConstruct` and `@PreDestroy`) for custom initialization and destruction logic.
  4. **Bean Scopes**:
     - Spring beans can have different scopes, which define the lifecycle and visibility of that bean within the application context.
     - Common scopes include `singleton` (a single instance for the entire application context), `prototype` (a new instance each time it's requested), and web-related scopes like `request`, `session`, and `application`.
  5. **Configuration**:
     - The Spring container can be configured using XML, Java annotations, or Java-based configuration classes.
     - Configuration defines the beans available in the application context, their dependencies, and other bean-specific configurations.
  6. **Aspect-Oriented Programming (AOP)**:
     - While AOP is sometimes considered outside the strict boundary of "core", it's tightly integrated and provides a way to define cross-cutting concerns (like logging, transaction management, and security) separately from the main application logic.
  7. **Spring Expression Language (SpEL)**:
     - SpEL provides a powerful way to query and manipulate objects at runtime. It's often used in configurations to define dynamic values for beans or to query the application context.
  8. **Resource Abstraction**:
     - Spring provides a consistent and abstracted way to access low-level resources like files, URLs, and classpath resources using the `Resource` interface.
  9. **Event Handling**:
     - Spring Core provides an application event framework that allows components to publish and listen to events within the Spring application context.
  10. **Internationalization (i18n)**:
      - Spring Core offers support for message localization, allowing applications to easily support multiple languages and regions.
  11. **Validation**:
      - While the validation capabilities have been expanded upon in other projects like Spring MVC, the core provides foundational support for validation and data binding.
- The above functionalities are just the tip of the iceberg. Over the years, the Spring ecosystem has expanded dramatically, encompassing a wide range of capabilities, from web applications with Spring MVC, to data access with Spring Data, to microservices with Spring Cloud. However, no matter which part of the Spring ecosystem you're working with, the principles and techniques introduced in Spring Core often play a central role.
- **Spring Container Primary functions**
  - Create and manage objects (Inversion of Control)
  - Inject object dependencies (Dependency Injection)
- **Configuring Spring Container**
  - XML configuration file (legacy)
  - Java Annotations (modern)
  - Java Source Code (modern)
- By utilizing IoC and DI, Spring helps in promoting a design that's decoupled, testable, and maintainable.

## Inversion of Control (IoC)

- **Definition**: IoC is a design principle in which the control of object creation, lifecycle, and other configurations is inverted, i.e., taken away from the application's main method or classes and handed over to a container or framework.
- The approach of outsourcing the construction and management of objects.
- **How Spring Handles It**: In the context of the Spring Framework, the Spring Container is responsible for managing the life cycle of beans (objects). Instead of the application code being responsible for instantiating and managing objects, Spring's container does that.

## Dependency Injection

- **Definition**: DI is a technique to achieve IoC. It allows dependencies (services, data, etc.) of a component to be supplied from the outside, instead of the component creating its own dependencies.
- The client delegates to another object the responsibility of providing its dependencies.
- **2 recommended types of injection**
  - **Constructor Injection**
    - Use this when you have **required** dependencies
    - Generally recommended by the spring.io development team as first choice
    - **Development Process**
      1. Define the dependency interface and class (`Coach.java` & `CricketCoach.java`)
      2. Create Demo REST Controller (`DemoController.java`)
      3. Create a constructor in your class for injections (`@Autowired` annotation is applied to a constructor `DemoController`)
      4. Add @GetMapping for `/daily-workout` (`DemoController.java`)
  - **Setter Injection**
    - Use this when you have **optional** dependencies
    - If dependency is not provided, your app can provide reasonable default logic
  - **How Spring Handles It**: When you define beans in the Spring configuration, you can also define which other beans they depend on. At runtime, Spring resolves these dependencies and injects the necessary beans into the target bean either via constructor, setter, or field injection.
  - **Field Injection**
    - Not recommended by spring.io team
    - In general, it makes the code harder to unit test
    - Inject dependencies by setting field values on your class directly (even private fields)
    - Accomplished by using Java Reflection
- **Spring AutoWiring**
  - Matches by type: class or interface
  - Spring will inject it automatically

## Spring for Enterprise applications

- Spring is targeted for enterprise, real-time / real-world applications
- Spring provides features such as
  - Database access and Transactions
  - REST APIs and Web MVC
  - Security
  - etc

## Component Scanning

- Spring will scan your Java classes for special annotations
- Automatically register the beans in the Spring container
- `@SpringBootApplication` is composed of the following annotations:

|        Annotation        |                                    Description                                    |
| :----------------------: | :-------------------------------------------------------------------------------: |
| @EnableAutoConfiguration |                 Enables Spring Boot's auto-configuration support                  |
|      @ComponentScan      | Enables component scanning of current package Also recursively scans sub-packages |
|      @Configuration      |   Able to register extra beans with @Bean or import other configuration classes   |

- By default, Spring Boot starts component scanning
  - From **same package as your main** Spring Boot application
  - Also scans sub-packages recursively
- This implicitly defines a base search package
  - Allows you to leverage default component scanning
  - No need to explicitly reference the base package name
- **Multiple implementations**
  - `@Qualifier`
  - `@Primary`
- **Lazy Initialization**
  - By default, when your application starts, all beans are initialized (@Component, etc ...)
  - Spring will create an instance of each and make them available
  - Instead of creating all beans up front, we can specify lazy initialization
  - A bean will only be initialized in the following cases:
    - It is needed for dependency injection
    - Or it is explicitly requested
  - Add the @Lazy annotation to a given class
  - Lazy Initialization using global configuration
  - **Advantages**:
    - Only create objects as needed
    - May help with faster startup time if you have large number of components
  - **Disadvantages**:
    - If you have web related components like @RestController, not created until requested
    - May not discover configuration issues until too late
    - Need to make sure you have enough memory for all beans once created
  - **Recommendation**:
    - Profile your application before configuring lazy initialization
    - Avoid the common pitfall of premature optimization
  - **Why does Spring automatically initialize them when they are not needed?**
    - Spring initializes all beans at startup because it needs to know all the beans and their dependencies in order to configure the application context correctly. When the application starts up, Spring reads the configuration metadata and uses it to create and wire up all the beans defined in the context.
    - This eager initialization ensures that all beans are ready to use when they are first requested. However, this can be a problem in applications with a large number of beans, or when the initialization of certain beans is expensive. Initializing all beans at startup can slow down application startup time and consume unnecessary resources.
    - To address this issue, Spring provides a way to enable lazy initialization of beans. This means that beans are only initialized when they are actually needed, rather than at application startup. This can improve startup time and reduce resource usage, especially in applications with many beans or beans with expensive initialization.
  - **How do I decide which objects should not be initialized?**
    - There are a few reasons why you might want to use lazy initialization in your Spring application:
    - **Performance Optimization**: Lazy initialization can improve performance by reducing the time and resources required for bean creation. If you have a large number of beans or beans that require significant resources to initialize, it can be beneficial to defer their creation until they are actually needed.
    - **Memory Optimization**: By delaying the creation of beans until they are needed, you can conserve memory resources. This can be especially useful in situations where you have a large number of beans or where beans have large memory footprints.
    - **Circular Dependency Resolution**: If you have a circular dependency between two or more beans, lazy initialization can be used to break the cycle and prevent a dependency injection failure.
    - **Improved Startup Time**: In some cases, beans that are not required for application startup can be lazily initialized, which can reduce the overall startup time of the application.
    - Overall, lazy initialization can be a useful tool for optimizing the performance and memory usage of your Spring application, especially in situations where you have a large number of beans or where beans have significant resource requirements.
  - **Is it a good practice to use global configuration to set all beans to lazy?**
    - Setting all beans to lazy initialization using global configuration is not necessarily a good practice as it depends on the specific requirements and constraints of your application.
    - While lazy initialization can improve application startup time and reduce resource consumption, it can also introduce some additional complexity and potentially impact application performance if used incorrectly. For example, lazy initialization can cause a delay in the first use of a bean, which may not be desirable in some cases.
    - It's important to carefully consider the trade-offs when deciding whether or not to use lazy initialization for individual beans or globally for all beans. It may be beneficial to use lazy initialization for beans that are rarely used or that have expensive initialization, but it may not be appropriate for beans that are frequently used or have lightweight initialization.
    - If you do decide to use global configuration to set all beans to lazy initialization, it's important to thoroughly test and validate the performance of your application under various usage scenarios to ensure that the overall impact is positive. Additionally, you may want to consider selectively disabling lazy initialization for specific beans where it is not appropriate or necessary.

## Bean Scopes

- Scope refers to the lifecycle of a bean
- How long does the bean live?
- How many instances are created?
- How is the bean shared?
- Default scope is **singleton**
  - Spring Container creates only one instance of the bean, by default
  - It is cached in memory
  - All dependency injections for the bean will reference the SAME bean

|     Scope      |                         Description                          |
| :------------: | :----------------------------------------------------------: |
|   singleton    | Create a single shared instance of the bean. Default scope.  |
|   prototype    |   Creates a new bean instance for each container request.    |
|    request     |    Scoped to an HTTP web request. Only used for web apps.    |
|    session     |    Scoped to an HTTP web session. Only used for web apps.    |
| global-session | Scoped to a global HTTP web session. Only used for web apps. |

## Bean Lifecycle

1. Container Started
2. Bean Instantiated
3. Dependencies Injected
4. Internal Spring Processing
5. Your Custom Init Method
6. Bean Is Ready For Use
7. Container Is Shutdown
8. our Custom Destroy Method
9. STOP

- Methods / Hooks
  - You can add custom code during **bean initialization** (`@PostConstruct`)
    - Calling custom business logic methods
    - Setting up handles to resources (db, sockets, file etc)
  - You can add custom code during **bean destruction** (`@PreDestroy`)
    - Calling custom business logic method
    - Clean up handles to resources (db, sockets, files etc)

## Special Note about Prototype Scope - Destroy Lifecycle Method and Lazy Init

- **Prototype Beans and Destroy Lifecycle**
  - There is a subtle point you need to be aware of with "prototype" scoped beans.
  - For "prototype" scoped beans, Spring does not call the destroy method. Gasp!
- In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean: the container instantiates, configures, and otherwise assembles a prototype object, and hands it to the client, with no further record of that prototype instance.
- Thus, although initialization lifecycle callback methods are called on all objects regardless of scope, in the case of prototypes, configured destruction lifecycle callbacks are not called. The client code must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding.
- Prototype beans are lazy by default. There is no need to use the @Lazy annotation for prototype scopes beans.

## Configuring Beans with Java Code

- **Development Process** (`SwimCoach.java`)
  - Create @Configuration class
  - Define @Bean method to configure the bean
  - Inject the bean into our controller
- **Use case for `@Bean`**
  - Make an existing third-party class available to Spring framework
  - You may not have access to the source code of third-party class
  - However, you would like to use the third-party class as a Spring bean
- **Real-World Project Example**
  - Our project used Amazon Web Service (AWS) to store documents
    - Amazon Simple Storage Service (Amazon S3)
    - Amazon S3 is a cloud-based storage system
    - can store PDF documents, images etc
  - We wanted to use the AWS S3 client as a Spring bean in our app
  - The AWS S3 client code is part of AWS SDK
    - We can’t modify the AWS SDK source code
    - We can’t just add @Component
  - However, we can configure it as a Spring bean using @Bean
- **Summary**
  - We could use the Amazon S3 Client in our Spring application
  - The Amazon S3 Client class was not originally annotated with `@Component`
  - However, we configured the S3 Client as a Spring Bean using `@Bean`
  - It is now a Spring Bean and we can inject it into other services of our application
  - Make an existing third-party class available to Spring framework

&nbsp;

# Hibernate/JPA CRUD

- [Hibernate](www.hibernate.org/orm)
  - A framework for persisting / saving Java objects in a database
  - **Benefits**
    - Handles all of the low-level SQL
    - Minimizes the amount of JDBC code you have to develop
    - Provides the Object-to-Relational Mapping (ORM)
- [**Jakarta Persistence API (JPA)**](https://www.jcp.org/en/jsr/detail?id=338)
  - previously known as Java Persistence API
  - Standard API for Object-to-Relational-Mapping (ORM)
  - Only a **specification**
    - Defines a set of interfaces
    - Requires an implementation to be usable
  - [JPA Vendors](https://en.wikipedia.org/wiki/Jakarta_Persistence)
    - Hibernate is the default implementation using Spring Boot
  - **Benefits**
    - By having a standard API, you are not locked to vendor's implementation
    - Maintain portable, flexible code by coding to JPA spec (interfaces)
    - Can theoretically switch vendor implementations
      - For example, if Vendor ABC stops supporting their product
      - You could switch to Vendor XYZ without vendor lock in
  - Uses JDBC for all database communications

## JPA Annotation

- **Entity Class**:
  - Java class that is mapped to a database table
  - `@Entity`
  - Must have a public or protected no-argument constructor
    - The class can have other constructors
  - **Constructor**:
    - Remember about constructors in Java If you don’t declare any constructors
      - Java will provide a no-argument constructor for free
    - If you declare constructors with arguments
      - then you do NOT get a no-argument constructor for free
      - In this case, you have to explicitly declare a no-argument constructor
- **ID Generation Strategies**
  - You can define your own CUSTOM generation strategy
    - Create implementation of `org.hibernate.id.IdentifierGenerator`
    - Override the method: `public Serializable generate(...)`

|          Name           |                                 Description                                 |
| :---------------------: | :-------------------------------------------------------------------------: |
|   GenerationType.AUTO   |          Pick an appropriate strategy for the particular database           |
| GenerationType.IDENTITY |             Assign primary keys using database identity column              |
| GenerationType.SEQUENCE |                Assign primary keys using a database sequence                |
|  GenerationType.TABLE   | Assign primary keys using an underlying database table to ensure uniqueness |

## Data Access Object (DAO) Design Pattern

- Responsible for **interfacing** with the database
  - Methods:
    - findById(...)
    - findAll()
    - findByLastName(...)
    - update(...)
    - delete(...)
    - deleteAll()
- Needs a **JPA Entity Manager** which is the main component for **saving/retrieving entities**
  - Needs a **Data Source** which defines database connection info
- JPA Entity Manager and Data Source are automatically created by Spring Boot
  - Based on the file: application.properties (JDBC URL, user id, password, etc ...)
- We can autowire/inject the JPA Entity Manager into our Student DAO
- Student DAO <-> Entity Manager <-> Data Source <-> Database
- Spring Boot Specialized Annotations for DAO
  - `@Transactional`
  - `@Repository`
  - Spring will automatically register the DAO implementation using component scanning
  - Spring also provides translation of any JDBC related exceptions
- **Create database tables from Java code using JPA/Hibernate annotations**
  - `application.properties`: `spring.jpa.hibernate.ddl-auto=create`
  - When you run your app, JPA/Hibernate will **drop** tables then **create** them

| Property Value |                                                  Property Description                                                   |
| :------------: | :---------------------------------------------------------------------------------------------------------------------: |
|      none      |                                               No action will be performed                                               |
|      drop      |                                               Database tables are dropped                                               |
|     create     |                            Database tables are dropped followed by database tables creation                             |
|  create-drop   | Database tables are dropped followed by database tables creation.</br>On application shutdown, drop the database tables |
|    validate    |                                           Validate the database tables schema                                           |
|     update     |                                            Update the database tables schema                                            |

- **Recommendations**
  - Corporate DBAs prefer SQL scripts for governance and code review
  - The SQL scripts can be customized and fine-tuned for complex database designs
  - The SQL scripts can be version-controlled
  - Can also work with schema migration tools such as Liquibase and Flyway

&nbsp;

# REST CRUD

- **REST**: REpresentational State Transfer
  - JSON & XML
  - HTTP Request Message
    - **Request line**: the HTTP command
    - **Header variables**: request metadata
    - **Message body**: contents of message
  - HTTP Response Message
    - **Response line**: server protocol and status code
    - **Header variables**: response metadata
    - **Message body**: contents of message
  - MIME Content Types
    - The message format is described by MIME content type
    - Multipurpose Internet Mail-Extension
    - **Basic Syntax**: type/sub-type
      - `text/html`
      - `text/plain`
      - `application/json`
      - `application/xml`
- Data binding is the process of converting JSON data to a Java POJO
  - Also known as
    - Mapping
    - Serialization / Deserialization
    - Marshalling / Unmarshalling
  - [jackson-databind](https://github.com/FasterXML/jackson-databind)
    - By default, Jackson will call appropriate getter/setter method
    - When building Spring REST applications
    - Spring will automatically handle Jackson Integration
    - JSON data being passed to REST controller is converted to POJO
    - Java object being returned from REST controller is converted to JSON

## Paypal

| HTTP Method |              Endpoint               |
| :---------: | :---------------------------------: |
|    POST     |       /v1/invoicing/invoices        |
|     GET     |       /v1/invoicing/invoices        |
|     GET     | /v1/invoicing/invoices/{invoice_id} |
|     PUT     | /v1/invoicing/invoices/{invoice_id} |
|   DELETE    | /v1/invoicing/invoices/{invoice_id} |

## GitHub Developer

| HTTP Method |      Endpoint       |
| :---------: | :-----------------: |
|    POST     |     /user/repos     |
|     GET     |     /user/repos     |
|     GET     | /repos/:owner/:repo |
|   DELETE    | /repos/:owner/:repo |

## SalesForce

| HTTP Method |                     Endpoint                     |
| :---------: | :----------------------------------------------: |
|     GET     | /services/apexrest/v1/individual/{individual_id} |
|     GET     |        /services/apexrest/v1/individual/         |
|    POST     |    /services/apexrest/clinic01/v1/individual/    |
|     PUT     |    /services/apexrest/clinic01/v1/individual/    |

# Application Architecture

- Delegate calls using a service layer and DAO layer

```
      Employee REST Controller              Employee REST Controller
                 |                                     |
                 v                                     v
         Employee Service                      Employee Repository
         /       |        \                  (Using Spring Data JPA)
        /        |         \                           |
Employee DAO  Skills DAO  Payroll DAO                  |
        \        |         /                           |
         \       |        /                            |
             Database                               Database
```

## Create DAO interface in Spring Boot

1. Set up Database Dev Environment
2. Create Spring Boot project using Spring Initializr
3. Update db configs in application.properties
4. Create Employee entity
5. Create DAO interface
6. Create DAO implementation
7. Create REST controller to use DAO

## Add a Service Layer

- **Purpose**
  - **Service Facade** design pattern
  - Intermediate layer for custom business logic
  - Integrate data from multiple sources (DAO/repositories)
- **Best Practices**
  - Apply transactional boundaries at the service layer
  - It is the service layer’s responsibility to manage transaction boundaries
  - For implementation code
    - Apply `@Transactional` on service methods
    - Remove `@Transactional` on DAO methods if they already exist

## Spring Data

```
    Spring Data REST
            |
            v
    Employee Repository
  (Using Spring Data JPA)
            |
            |
            |
            |
         Database
```

- **JPA**
  - Create a DAO and just plug in your **entity type** and **primary key**
  - **Advanced features**:
    - Extending and adding custom queries with JPQL
    - Query Domain Specific Language (Query DSL)
    - Defining custom methods (low-level coding)
- **REST**
  - 3 Items:
    1. **Entity**: `Employee`
    2. **JpaRepository**: `EmployeeRepository extends JpaRepository`
    3. **Maven POM dependency for**: `spring-boot-starter-data-rest`
  - Spring Data REST endpoints are [**HATEOAS**](https://spring.io/projects/spring-hateoas) compliant
    - Hypermedia as the Engine of Application State
    - Hypermedia-driven sites provide information to access REST interfaces
    - Think of it as meta-data for REST data
  - Spring Data REST only uses ID on the URL
  - By default, Spring Data REST will create endpoints based on entity type
    - Simple pluralized form
      - First character of Entity type is lowercase
      - Then just adds an "s" to the entity
      - Spring Data REST does NOT handle:
        - Goose - Geese
        - Person - People
        - Syllabus - Syllabi
      - **Solution**: Specify plural name / path with an annotation

|                Name                |                  Description                  |
| :--------------------------------: | :-------------------------------------------: |
|     spring.data.rest.base-path     | Base path used to expose repository resources |
| spring.data.rest.default-page-size |             Default size of pages             |
|   spring.data.rest.max-page-size   |             Maximum size of pages             |

&nbsp;

# REST API Security

- [spring-security](https://spring.io/projects/spring-security)
- **Authentication**: Check user id and password with credentials stored in app / db
- **Authorization**: Check to see if user has an authorized role
- **Declarative Security**: Define application’s security constraints in configuration
  - All Java config: @Configuration
  - Provides separation of concerns between application code and security
- **Programmatic Security**:
  - Spring Security provides an API for custom application coding
  - Provides greater customization for specific app requirements
- Authentication and Authorization
  - In-memory
  - JDBC
  - LDAP
  - Custom / Pluggable
  - others ...
- **Development Process**
  - Edit `pom.xml` and add `spring-boot-starter-security`
  - `application.properties`
    - `spring.security.user.name=scott`
    - `spring.security.user.password=test123`
  - Create Spring Security Configuration (@Configuration)
    - Since we defined our users here
    - Spring Boot will NOT use the user/pass from the `application.properties` file
  - Add users, passwords and roles

|   ID   |       Description       |
| :----: | :---------------------: |
|  noop  |  Plain text passwords   |
| bcrypt | BCrypt password hashing |

| HTTP Method |          Endpoint           |   CRUD Action   |   Role   |
| :---------: | :-------------------------: | :-------------: | :------: |
|     GET     |       /api/employees        |    Read all     | EMPLOYEE |
|     GET     | /api/employees/{employeeId} |   Read single   | EMPLOYEE |
|    POST     |       /api/employees        |     Create      | MANAGER  |
|     PUT     |       /api/employees        |     Update      | MANAGER  |
|   DELETE    | /api/employees/{employeeId} | Delete employee |  ADMIN   |

## Cross-Site Request Forgery (CSRF)

- Spring Security can protect against CSRF attacks
- Embed additional authentication data/token into all HTML forms
- On subsequent requests, web app will verify token before processing
- Primary use case is traditional web applications (HTML forms etc ...)
- **When to use CSRF Protection?**
  - Use CSRF protection for any normal browser web requests
  - Traditional web apps with HTML forms to add/modify data
- Non-browser clients
  - you _may_ want to disable CSRF protection
- In general, not required for stateless REST APIs that use POST, PUT, DELETE and/or PATCH

## JDBC Authentication

- **Development Process**
  1. Develop SQL Script to set up database tables
     - `authorities` same as `roles`
  2. Add database support to Maven POM file
  3. Create JDBC properties file
  4. Update Spring Security Configuration to use JDBC

## BCrypt

- Spring Security recommends using the popular **bcrypt algorithm**
  - Performs [one-way encrypted hashing](https://bcrypt.online/)
  - Adds a random salt to the password for additional protection
  - Includes support to defeat brute force attacks
  - Modify DDL for password field, length should be 68
- **Login process**
  1. Retrieve password from db for the user
  2. Read the encoding algorithm id (bcrypt etc)
  3. For case of bcrypt, encrypt plaintext password from login form (using salt from db password)
  4. Compare encrypted password from login form WITH encrypted password from db
  5. If there is a match, login successful
  6. If no match, login NOT successful
- **Development Process**
  - Create our custom tables with SQL
  - Update Spring Security Configuration
    - Provide query to find user by user name
    - Provide query to find authorities / roles by user name

&nbsp;

# Spring MVC

## Thymeleaf

- Thymeleaf is a **Java templating engine**
- Commonly used to generate the HTML views for web apps
- Thymeleaf template
  - Can be an HTML page with some Thymeleaf expressions
  - Include dynamic content from Thymeleaf expressions
- **Development Process**
  - Add Thymeleaf to Maven POM file
  - Develop Spring MVC Controller
  - Create Thymeleaf template
- **Thymeleaf template files go in**: `src/main/resources/templates`
- For web apps, Thymeleaf templates have a `.html` extension
- **Additional Features**:
  - Looping and conditionals
  - CSS and JavaScript integration
  - Template layouts and fragments
- **Using CSS with Thymeleaf Templates**
  - Local CSS files as part of your project
  - Referencing remote CSS files
- **3rd Party CSS Libraries: Bootstrap**
  - Local Installation
  - Download Bootstrap file(s) and add to `/static/css` directory

## Validation

- [**Java’s Standard Bean Validation API**](http://www.beanvalidation.org)
  - Java has a standard Bean Validation API
  - Defines a metadata model and API for entity validation
  - Spring Boot and Thymeleaf also support the Bean Validation API
- **Development Process**
  - Create Customer class and add validation rules
  - Add Controller code to show HTML form
  - Develop HTML form and add validation support
  - Perform validation in the Controller class
  - Create confirmation page
- **`@InitBinder` annotation**
  - Works as a pre-processor (Pre-process each web request to our controller)
  - Method annotated with `@InitBinder` is executed
- **`typeMismatch.customer.freePasses=Invalid number`**
  - Error type
  - Spring model attribute name
  - Field name
  - Our custom message
- **Custom Validation**
  - Perform custom validation based on your business rules
  - Spring MVC calls our custom validation
  - Custom validation returns boolean value for true/ false

&nbsp;

# Spring MVC Security

- **Goals**
  - Secure Spring MVC Web Apps
  - Develop login pages (default and custom)
  - Define users and roles with simple authentication
  - Protect URLs based on role
  - Hide/show content based on role
  - Store users, passwords and roles in DB (plain-text -> encrypted)
- [**Spring Security Reference Manual**](https://docs.spring.io/spring-security/reference/)
- **Spring Security Model**
  - A framework for security
  - Implemented using **Servlet filters** in the background
    - Used to pre-process / post-process web requests
    - Can route web requests based on security logic
    - Provides a bulk of security functionality with servlet filters
  - **2 methods**:
    - Declarative
    - Programmatic

&nbsp;

![spring_security_overview](./_00_diagrams/spring_security_overview.png)

&nbsp;

![spring_security_in_action](./_00_diagrams/spring_security_in_action.png)

&nbsp;

- **Context Path**
  - The root path for your web application
  - Allows us to dynamically reference context path of application

&nbsp;

# JPA/ Hibernate Advanced Mappings

- In the database, you most likely will have
  - Multiple Tables
  - Relationships between Tables
- Need to model this with Hibernate
- **Database Concept**
  - One-to-One
  - One-to-Many, Many-to-One
  - Many-to-Many
  - Primary key and foreign key
  - Cascade
- **Fetch Types**
  - **Eager** will retrieve everything
  - **Lazy** will retrieve on request
- **Entity Lifecycle**

| Operations |                                    Description                                     |
| :--------: | :--------------------------------------------------------------------------------: |
|   Detach   |        If entity is detached, it is not associated with a Hibernate session        |
|   Merge    |     If instance is detached from session, then merge will reattach to session      |
|  Persist   |  Transitions new instances to managed state. Next flush / commit will save in db.  |
|   Remove   | Transitions managed entity to be removed. Next flush / commit will delete from db. |
|  Refresh   |            Reload / synch object with data from db. Prevents stale data            |

- **Cascade Types**

| Cascade Type |                                         Description                                          |
| :----------: | :------------------------------------------------------------------------------------------: |
|   PERSIST    |            If entity is persisted / saved, related entity will also be persisted             |
|    REMOVE    |             If entity is removed / deleted, related entity will also be deleted              |
|   REFRESH    |                If entity is refreshed, related entity will also be refreshed                 |
|    DETACH    | If entity is detached (not associated w/ session), then related entity will also be detached |
|    MERGE     |                 If entity is merged, then related entity will also be merged                 |
|     ALL      |                                  All of above cascade types                                  |

&nbsp;

![entity_lifecycle_session_method_calls](_00_diagrams/entity_lifecycle_session_method_calls.png)

&nbsp;

## One-to-One Mapping (Unidirectional)

```
Instructor -> Instructor Detail
```

- **Development Process**
  - Define database tables
  - Create `InstructorDetail` class
  - Create `Instructor` class
  - Create Main App

## One-to-One Mapping (Bidirectional)

- Method to load an `InstructorDetail` to get the associated `Instructor`

```
Instructor <-> Instructor Detail
```

- **Development Process**
  - Make updates to `InstructorDetail` class:
    - Add new field to reference `Instructor`
    - Add getter/setter methods for `Instructor`
    - Add `@OneToOne` annotation
  - Create Main App

## One-to-Many Mapping (Bidirectional)

```
          Instructor
              ^
              |
              |
   +-------+-------+-------+
   |       |       |       |
   V       V       V       V
Course  Course  Course  Course
```

- **Development Process**
  - Define database tables
  - Create `Course` class
  - Update `Instructor` class
  - Create Main App
- **Only load data when absolutely needed**
  - Prefer **lazy loading** instead of **eager loading**
  - Lazy loading will load the main entity first
  - Load dependent entities on demand (lazy)

|   Mapping   | Default Fetch Type |
| :---------: | :----------------: |
|  @OneToOne  |  FetchType.EAGER   |
| @OneToMany  |   FetchType.LAZY   |
| @ManyToOne  |  FetchType.EAGER   |
| @ManyToMany |   FetchType.LAZY   |

## One-to-Many Mapping (Unidirectional)

```
            Course
              ^
              |
              |
   +-------+-------+-------+
   |       |       |       |
   V       V       V       V
Review  Review  Review  Review
```

- **Development Process**
  - Define database tables
  - Create `Review` class
  - Update `Course` class

## Many-to-Many Mapping

![mappings_uml](_00_diagrams/mappings_uml.png)

![join_table_uml](_00_diagrams/join_table_uml.png)

![join_table](_00_diagrams/join_table.png)

- **Join Table**
  - A table that provides a mapping between two tables.
  - It has foreign keys for each table to define the mapping relationship.
- **Development Process**
  - Define database tables
  - Update `Course` class
  - Update `Student` class

&nbsp;

# Aspect-Oriented Programming (AOP)

- Account Controller <-> Account Service <-> Account DAO <-> Database
- **Requirements for DAO methods**
  - Add logging
  - Make sure user is authorized

## Cross-Cutting Concerns

Cross-cutting concerns are aspects of a program that affect other concerns. These concerns often cannot be completely decomposed from the rest of the system in both the design and implementation. Examples include logging, security, transactions, and caching. These concerns are applicable throughout an application and do not usually neatly fit into the architecture of the software.

Here's a breakdown of some common cross-cutting concerns:

1. **Logging**: Capturing what happens in your application, useful for debugging and auditing.
2. **Security**: Concerns like authentication and authorization that apply to many parts of an application.
3. **Transactions**: Ensuring that a series of operations are completed successfully before committing any changes.
4. **Caching**: Storing and retrieving frequently-used data to improve performance.
5. **Monitoring**: Keeping track of application health and performance metrics.
6. **Data Validation**: Ensuring that data is clean, correct, and useful.
7. **Error Handling**: Defining how to propagate errors and handle them in a unified way.
8. **Internationalization (i18n) and Localization (l10n)**: Adapting the user interface for multiple languages or regions.

### How to Handle Cross-Cutting Concerns

1. **Aspect-Oriented Programming (AOP)**: This programming paradigm aims to increase modularity by allowing the separation of cross-cutting concerns. Libraries like AspectJ for Java can be used for this.

2. **Middleware**: In frameworks like Express.js for Node.js or Django for Python, middleware can be used to handle these concerns.

3. **Decorators**: In languages that support them, like Python or TypeScript, decorators can be used to inject behavior before, after, or around method calls.

4. **Interceptors**: In frameworks like Angular or in languages like Java (with Java EE), you can use interceptors to write functions that are automatically called whenever a method is invoked.

5. **Event Bus**: An event bus can be used to decouple event producers from consumers, thus allowing cross-cutting concerns to be handled in a centralized manner.

6. **Built-in Language Features**: Some languages have built-in support for handling certain cross-cutting concerns. For example, the `try`/`catch` mechanism in many languages is a built-in way to handle errors.

**Best Practices:**

- **Consistency**: Choose a consistent way to handle each cross-cutting concern across your application.
- **Documentation**: Document how each concern is handled, especially if you're using less common methods or custom-built solutions.
- **Separation of Concerns**: Try to keep the logic for each concern isolated from the main business logic and from other cross-cutting concerns.

Understanding and properly handling cross-cutting concerns is a hallmark of mature software design and is something that senior engineers pay close attention to. It's essential for creating maintainable, scalable, and robust software.

![aop_proxy_design_pattern](_00_diagrams/aop_proxy_design_pattern.png)

- **Benefits of AOP**
  - **Code for Aspect is defined in a single class**
    - Much better than being scattered everywhere
    - Promotes code reuse and easier to change
  - **Business code in your application is cleaner**
    - Only applies to business functionality: addAccount
    - Reduces code complexity
  - **Configurable**
    - Based on configuration, apply Aspects selectively to different parts of app
    - No need to make changes to main application code ... very important!
- **Additional AOP Use Cases**
  - **Most common**: logging, security, transactions
  - **Audit logging**: who, what, when, where
  - **Exception handling**: log exception and notify DevOps team via SMS/email
  - **API Management**: - how many times has a method been called user - **analytics**: what are peak times? what is average load? who is top user?
- **Advantages**:
  - Reusable modules
  - Resolve code tangling
  - Resolve code scatter
  - Applied selectively based on configuration
- **Disadvantages**:
  - Too many aspects and app flow is hard to follow
  - Minor performance cost for aspect execution (run-time weaving)
- **AOP Terminology**
  - **Aspect**: module of code for a cross-cutting concern (logging, security, ...)
  - **Advice**: What action is taken and when it should be applied
    - **Before advice**: run before the method
    - **After finally advice**: run after the method (finally)
    - **After returning advice**: run after the method (success execution)
    - **After throwing advice**: run after method (if exception thrown) Around advice: run before and after method
  - **Join Point**: When to apply code during program execution
  - **Pointcut**: A predicate expression for where advice should be applied
  - **Weaving**
    - Connecting aspects to target objects to create an advised object
    - **Different types of weaving**: Compile-time, load-time or run-time
    - **Regarding performance**: run-time weaving is the slowest
- **AOP Frameworks**
  - **Spring AOP**
    - Spring provides AOP support
    - **Key component of Spring**: Security, transactions, caching etc
    - Uses run-time weaving of aspects
    - **Advantages**:
      - Simpler to use than AspectJ
      - Uses Proxy pattern
      - Can migrate to AspectJ when using `@Aspect` annotation
    - **Disadvantages**:
      - Only supports method-level join points
      - Can only apply aspects to beans created by Spring app context
      - Minor performance cost for aspect execution (run-time weaving)
  - [**AspectJ**](www.eclipse.org/aspectj)
    - Original AOP framework, released in 2001
    - Provides complete support for AOP Rich support for
      - **join points**: method-level, constructor, field
      - **code weaving**: compile-time, post compile-time and load-time
    - **Advantages**:
      - Support all join points
      - Works with any POJO, not just beans from app context
      - Faster performance compared to Spring AOP
      - Complete AOP support
    - **Disadvantages**:
      - Compile-time weaving requires extra compilation step
      - AspectJ pointcut syntax can become complex
- **Spring Boot AOP Starter**
  - Spring Boot will automatically enable support for AOP
  - No need to explicitly use `@EnableAspectJAutoProxy`

## `@Before` Advice Type

- **Development Process**
  - Create target object: AccountDAO
  - Create main app
  - Create an Aspect with `@Before` advice
- **Best Practices: Aspect and Advices**
  - Keep the code small
  - Keep the code fast
  - Do not perform any expensive / slow operations Get in and out as QUICKLY as possible

## Pointcut Expressions

- A predicate expression for where advice should be applied
- `execution(modifiers-pattern? return-type-pattern declaring-type-pattern? method-name-pattern(param-pattern) throws-pattern?)`
  - The pattern is optional if it has `?`

|      |                     param-pattern                     |
| :--: | :---------------------------------------------------: |
|  ()  |          matches a method with no arguments           |
| (\*) |    matches a method with one argument of any type     |
| (..) | matches a method with 0 or more arguments of any type |

## Pointcut Declaration

- How can we reuse a pointcut expression?
- **Development Process**
  - Create a pointcut declaration
  - Apply pointcut declaration to advice(s)
- **Benefits of Pointcut Declarations**
  - Easily reuse pointcut expressions
  - Update pointcut in one location
  - Can also share and combine pointcut expressions
- **Combine pointcut expressions using logic operators**
  - AND (`&&`)
  - OR (`||`)
  - NOT (`!`)

## Control Order

- Refactor: Place advices in separate Aspects
- Control order on Aspects using the `@Order` annotation
- Guarantees order of when Aspects are applied

## Reading Method Arguments with JoinPoints

- **Development Process**
  - Access and display **Method Signature**
  - Access and display **Method Arguments**

## `@AfterReturning` Advice Type

- This advice will run after the method call **(success execution)**
- **Use Cases**
  - **Most common**: logging, security, transactions
  - **Audit logging**: who, what, when, where
  - **Post-processing Data**:
    - Post process the data before returning to caller
    - Format the data or enrich the data (really cool but be careful)
- **Development Process**
  - Add constructors to `Account` class
  - Add new method: find `Accounts()` in `AccountDAO`
  - Update main app to call the new method: `findAccounts()`
  - Add `@AfterReturning` advice

## `@AfterThrowing` Advice Type

- This advice will run **after an exception is thrown**
- **Use Cases**
  - Log the exception
  - Perform auditing on the exception
  - Notify DevOps team via email or SMS
  - Encapsulate this functionality in AOP aspect for easy reuse
- **Exception Propagation**
  - We are only intercepting the exception (reading it)
  - However, the exception is still propagated to calling program
  - If you want to stop the exception propagation then use the `@Around` advice

![sequence_diagram_afterthrowing_advice](_00_diagrams/sequence_diagram_afterthrowing_advice.png)

- **Development Process**
  - In Main App, add a `try/catch` block for exception handling
  - Modify `AccountDAO` to simulate throwing an exception
  - Add `@AfterThrowing` advice

## `@After` Advice Type

- **Use Cases**
  - Log the exception and/or perform auditing
  - Code to run regardless of method outcome
  - Encapsulate this functionality in AOP aspect for easy reuse
- **Tips**
  - The `@After` advice does not have access to the exception
  - If you need exception, then use `@AfterThrowing` advice
  - The `@After` advice should be able to run in the case of success or error
  - Your code should not depend on happy path or an exception
  - Logging / auditing is the easiest case here

![sequence_diagram_after_advice](_00_diagrams/sequence_diagram_after_advice.png)

- **Development Process**
  - Add `@After` advice
  - Test for failure/exception case
  - Test for success case

## `@Around` Advice Type

- **Use Cases**
  - **Most common**: logging, auditing, security
  - Pre-processing and post-processing data
  - Instrumentation / profiling code
    - How long does it take for a section of code to run?
  - Managing exceptions
    - Swallow / handle / stop exceptions
- **ProceedingJoinPoint**
  - When using `@Around` advice
  - You will get a reference to a **“proceeding join point”**
  - This is a handle to the **target method**
  - Your code can use the **proceeding join point** to execute **target method**

![sequence_diagram_around_advice](_00_diagrams/sequence_diagram_around_advice.png)

- **Development Process**
  - Create `TrafficFortuneService` service
  - Update main app to call `TrafficFortuneService` service
  - Add `@Around` advice

&nbsp;

# Integrating AOP with Spring MVC CRUD app

- Add AOP Logging support to our Spring MVC CRUD app

![aop_mvc_crud_logging_aspect](_00_diagrams/aop_mvc_crud_logging_aspect.png)

- **Development Process**
  - Add Spring Boot AOP Starter to Maven pom file
  - CreateAspect
    - Add logging support
    - Setup pointcut declarations
    - Add `@Before` advice
    - Add `@AfterReturning` advice

&nbsp;
