- [About The Project](#about-the-project)
- [\_01introduction](#_01introduction)
- [\_02dataTypes](#_02datatypes)
- [\_03featuresAndArchitecture](#_03featuresandarchitecture)
- [\_04operatorAndExpressions](#_04operatorandexpressions)
- [\_05stringClassAndPrinting](#_05stringclassandprinting)
- [\_06conditionalStatements](#_06conditionalstatements)
- [\_07loops](#_07loops)
- [\_08arrays](#_08arrays)
- [\_09methods](#_09methods)
- [\_10oop](#_10oop)
- [\_11inheritance](#_11inheritance)
- [\_12abstractClasses](#_12abstractclasses)
- [\_13interfaces](#_13interfaces)
- [\_14innerClasses](#_14innerclasses)
- [\_15staticAndFinal](#_15staticandfinal)
- [\_16packages](#_16packages)
- [\_18exceptionHandling](#_18exceptionhandling)
- [\_19multithreading](#_19multithreading)
  - [Threads](#threads)
  - [Synchronization](#synchronization)
    - [Resource Sharing](#resource-sharing)
    - [Critical Section](#critical-section)
    - [Mutual Exclusion](#mutual-exclusion)
    - [Locking/Mutex](#lockingmutex)
    - [Semaphore](#semaphore)
    - [Monitor](#monitor)
    - [Race Condition](#race-condition)
    - [Inter-Thread Communication](#inter-thread-communication)
- [\_20javaLangPkg](#_20javalangpkg)
  - [Object Class](#object-class)
  - [Wrapper Class](#wrapper-class)
  - [String vs StringBuffer vs StringBuilder](#string-vs-stringbuffer-vs-stringbuilder)
  - [Enum](#enum)
  - [Reflect Package](#reflect-package)
- [\_21annotationsAndJavaDoc](#_21annotationsandjavadoc)
  - [Annotations](#annotations)
- [\_22lambdaExpressions](#_22lambdaexpressions)
- [\_23javaIOStreams](#_23javaiostreams)
- [\_24generics](#_24generics)
- [\_25collectionFramework](#_25collectionframework)

&nbsp;

# About The Project

- Learn JAVA Programming - Beginner to Master
- Deep Dive in Core Java programming -Standard Edition. A Practical approach to learn Java. Become a Java Expert
- [YouTube - Abdul Bari](https://www.youtube.com/channel/UCZCFT11CWBi3MHNlGf019nw)
- [GitHub - Abdul Bari](https://github.com/mohammedabdulbari)
- [Original Repo](https://github.com/mohammedabdulbari/Java-SE)

&nbsp;

# \_01introduction

- **JDK:** Java Development Toolkit
  - First.java -> `javac First.java` (Compiler) -> First.class
- **JRE:** Java Runtime Environment (Class Library)
  - `java First` (Executing First.class)
- **JVM:** Java Virtual Machine
- [stackchief - Which Version of Java Should You Use?](https://www.stackchief.com/blog/Which%20Version%20of%20Java%20Should%20You%20Use%3F)
- [Oracle - Class Scanner](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html)
- `javap java.util.Scanner`

&nbsp;

# \_02dataTypes

```sh
javap java.lang.Integer
javap java.lang.Byte
javap java.lang.Float
javap java.lang.Character
javap java.lang.Boolean
```

- [javapoint - Java Naming Convention](https://www.javatpoint.com/java-naming-conventions)
- [Oracle - 3.8. Identifiers](https://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.8)
- **Variables Naming Rules**
  1. Case Sensitive
  2. Contains Alphabets, Numbers, \_ or $
  3. Starts with Alphabet, \_ or $
  4. Should not be a keyword
  5. Should not be a class name, if class is also in use
  6. No limit on length of name
  7. Follow camelCases
- Variable is the name given to the memory. When a variable is declared, memory is allocated.
- Literals are the values, used in the program to store them in variables.
- **Literals**
  - Literals Type

|             |      |          Number System          |                  |
| :---------: | :--: | :-----------------------------: | :--------------: |
|   Decimal   | (10) |       0,1,2,3,4,5,6,7,8,9       |   `byte b=10;`   |
|   Binary    | (2)  |               0,1               | `byte b=0b1010;` |
|    Octal    | (8)  |    0,1,2,3,4,5,6,7,10,11,12     |  `byte b=012;`   |
| Hexadecimal | (16) | 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F |  `byte b=0xA;`   |

&nbsp;

|  Type   |       Size        |                       Range                       |       Default       |
| :-----: | :---------------: | :-----------------------------------------------: | :-----------------: |
|  Byte   |         1         |                    -128 to 127                    |          0          |
|  Short  |         2         |                  -32768 to 32767                  |          0          |
|   int   |         4         |             -2147483648 to 2147483647             |          0          |
|  long   |         8         |  -9223372036854775808 to</br>9223372036854775807  |          0          |
|  float  |         4         |               ±1.4E-45 to ±3.4E+38                |        0.0f         |
| double  |         8         |                ±439E to ±1.7E+308                 |        0.0d         |
|  Char   |         2         | '\u0000' to '\uffff'</br>that is, from 0 to 65535 | '\u0000'</br>\40000 |
| Boolean | Depends on<br>JVM |                    True/ False                    |        FALSE        |

- [Unicode](www.unicode.org)
- **Integral DataType**
  - The reason for java having short type of data is for smaller number for efficient memory utilization , therefore byte is also used for the same purpose
  - They are all signed datatype as all of them support both positive and negative datatype
  - In bytes one bit is reserved for sign value ( + , - )
  - Number can be stored only in 7 bits
  - The minimum number that can be stored in this 7 bits is 0 and max is 127
  - The negative numbers are stored in two’s compliment form

&nbsp;

# \_03featuresAndArchitecture

- **Aim**
  - To check errors
  - Convert into machine code
  - Execution/ running a program: Compiler does not takes responsibility of execution , Interpreter is responsible for execution of code
- **Compiler**
  - Language e.g.: C & C++
  - Compiler will convert program into machine code if they are no error
  - Compilation from source code to machine code is done only once
  - As translation is done once that’s why compiler doesn't run codes
  - Even if there’s one error in the program , it will not compile the full code must be error free to transform into machine code.
- **Interpreter**
  - JavaScript is an interpreter based language
  - JS runs inside browser , it cannot run independently
  - It translate and runs/ executes the code line by line
  - Translation is done again and again
- **Compiler vs interpreter**
  - Compiler is faster than interpreter
  - In interpreter if there is error in one line the code will still execute
  - Interpreter language is easy than compiler language

![platform-independent](src/_03featuresAndArchitecture/platform-independent.png)

- **Platform Independent**
  - Java is platform independent language
  - Java compiler will convert source code into byte code although this byte code is not executable but it is a error free program
  - To execute this java program we call a JVM (java virtual machine) and ask them to execute this file
  - This virtual machine will have an interpreter or JIT Compiler that will convert this byte code into machine code and get it executed on the hardware
  - JVM cannot directly interact with the hardware , it needs to interact via a software
- **How java is platform independent**
  - All the bytes codes first interact with JVM , as it is the source which converts the source code into the machine code of java
  - As the byte code is same it can run on various operation system and produce the same result provided that it has a JVM hence Java is platform independent
  - Therefore once you compile a java code you can run it anywhere

![cpp-java](src/_03featuresAndArchitecture/cpp-java.png)

- **Architecture of JVM**
  - JVM is responsible for executing the java code
  - The main memory is in 3 parts:
    - one where the **main** program resides
    - the other for storing the program data like variables etc this values are stored in **stack** area
    - the last space is free space which is used during the run time of program and is called **heap** area

![architecture-of-jvm](src/_03featuresAndArchitecture/architecture-of-jvm.png)

- The file with the program is loaded into the code section and the process is called **class loading** as all java code is in class format
- The job of bringing the code into memory is done by class loader
- The interpreter inside Java code is used to convert the code into the machine code and get executed
- Dynamic values are created inside heap when you say `new`
- Local variables are created inside stack and they belong to main memory
- When print is called its own stack is created
- JVM also has **garbage collector it takes away the values in heap** which are not in use
- JVM keeps the addresses of next instructions that needs to be executed and it will hand it over to the CPU
- In java we can invoke or call the methods of other languages like c, c++ this is called **native methods**, there will be a separate stack for this

![class-loader](src/_03featuresAndArchitecture/class-loader.png)

![jvm-architecture-details](src/_03featuresAndArchitecture/jvm-architecture-details.png)

- **Features**
  - **Simple**
  - It is **secure**, as it cannot get infected by virus or any malware because of JVM as it has a securer/ verifier
  - It is Platform independent hence **portable**
  - The style of java **programming object oriented** I.e, Abstraction, Inheritance, Encapsulation and Polymorphism
  - Even if there is unavailability of program JVM makes sure to run it without any crashes in it therefore it is very **robust** this is achieved by **exception handling**
  - Java supports **multithreading**
  - Java is hardware **architectural neutral** so, it can run on any hardware
    - Von-Neumann Architecture
  - It is interpreter language but gives **high performance**
  - It supports **distributed** computing which is mostly used by businesses globally where multiple business are connected to a single network
  - Java is **dynamic** because it is created in heap

&nbsp;

# \_04operatorAndExpressions

- The mechanism of converting data type internally by the compiler is known as **COERCION**.
- **Bit Merging and Masking:**
  - One of the application of bitwise operators.
  - They are used to check whether the bits are marked as zero or one.
  - The process of setting one of the bit as ‘1’ is known as merging.
  - Masking means you are hiding all the bits and showing only particular bits
  - 4 bits is also known as nibble.
  - XOR operation is used for Swapping two numbers without inserting any third number.
- **Widening and Narrowing:**
  - It is related to conversion of data type of given data item.
  - **Widening**: the process of storing the data of **smaller size data type into a larger size data type** can be done automatically by the compiler.
    - The compiler directly converts the data type without showing any errors i.e from source data type to the destination data type.
    - Since it is done internally it is said as automatically.
    - The source and destination data type should be **compatible**.
    - It is also known as **upcasting**.
  - **Narrowing:** the process of storing the data of **larger size data type into a smaller size data type**.
    - due to difference in size it may lead to loss of data.
    - it is not compatible.
    - typecasting is required for narrowing.
    - is also called **down casting**.
  - Boolean is compatible only with Boolean.

|                      |      |
| :------------------: | :--: |
|         AND          |  &   |
|          OR          | \|\| |
|         NOT          |  ~   |
|         XOR          |  ^   |
|     Right Shift      |  >>  |
| Unsigned Right Shift | >>>  |
|      Left Shift      | <<<  |

- **Bitwise Operator** are faster than other operators
  - It works on the principle of Truth Tables

|  A  |  B  | A & B |
| :-: | :-: | :---: |
|  0  |  0  |   0   |
|  0  |  1  |   0   |
|  1  |  0  |   0   |
|  1  |  1  |   1   |

|  A  |  B  | A \| B |
| :-: | :-: | :----: |
|  0  |  0  |   0    |
|  0  |  1  |   1    |
|  1  |  0  |   1    |
|  1  |  1  |   1    |

|  A  |  B  | A ^ B |
| :-: | :-: | :---: |
|  0  |  0  |   0   |
|  0  |  1  |   1   |
|  1  |  0  |   1   |
|  1  |  1  |   0   |

- These bitwise operator are performed only on integer type of data
- If you are taking byte and short the result will still be an integer
- The data type which are compatible with each other is given below , source is in right hand side , destination is on left hand side

![widening_narrowing_chart](src/_00diagrams/widening_narrowing_chart.png)

&nbsp;

# \_05stringClassAndPrinting

- Overloaded method
- String
  - `String str1` = "Java Program"
    - `str1`: reference name
    - `"Java Program"`: string object
  - String is a built-in class available in java.
  - Variable of type object are called as reference.
  - String object is referred to as a literal.
  - References are used for holding or pointing objects.
  - String literal is taken in “ “.
  - Keyword `new` is taken to create an object in **heap**.
  - Constructors are methods or functions used for creating string object.
  - There are three types of constructors:
    - `String(char[])`: Array of characters is taken and is converted into string.
    - `String(byte[])`: Array of bytes is taken and is converted into a string.
    - `String(string)`:
      - A string literal is taken in this method.
      - New string is created using this method.
  - Java maintains a pool of string constants.
  - **Whenever new is applied the object is created in heap memory and the memory occupied by the object literal is in pool.**
  - **When same literal is used java does not create another object.**
  - **When new is applied the object in pool may or may not be created.**
  - String objects are **immutable**/ they cannot be modified.
- **Regular Expression**

&nbsp;

# \_06conditionalStatements

- **Relational Operators**
  - `<`, `<=`, `>`, `>=`, `==`, `!=`
- **Logical Operators**
  - `&&`, `||`, `!`,

&nbsp;

# \_07loops

- **4 types of loops**
  - For loop
  - While loop
  - Do while loop
  - For each loop

&nbsp;

# \_08arrays

- Array is a collection of similar data elements
- In java the array size is given after creating the new object.
  - As `int A[]= new int[x];`
  - Where `A[]` is the **reference** and `int[x]` is the **object**.
  - Where object is created in the **heap**.
  - And the reference is either in **stack** or **heap**.
- 1D arrays
- 2D arrays
  - Suitable for matrices and tabular form.
  - Jagged array is a type of array in which the members are of different sizes.
  - In jagged array the members of arrays are created separately according to their sizes using their indices.

&nbsp;

# \_09methods

- **What are methods:**
  - Methods are members of classes which provide functionality for classes.
  - The functions performing on the data are known as methods.
  - When a method returns a value then the method itself takes the value.
  - A method will have its own copy of variable.
- **Passing object as parameters**
  - When the method is called the value of actual parameters are copied in formal parameters which is the only parameter passing method in java.
  - The address of object in formal and actual parameter is **same**.
  - String cannot be modified as it is immutable.
  - A method can also return an object.
- **Parameter passing in java**
  - The parameters/arguments passed in calling method are called as **actual parameters**.
  - And the parameters of a called method are called as **formal parameters**.
  - Formal parameters are nothing but input into a method where the return type is known as output to a method.
  - The contents of actual parameters are copied in formal parameters is the only method of parameter passing in java.
  - Passing of objects also follow the same method.
  - Parameter passing for primitive data types the values are copied in formal parameters, whereas in parameter passing of objects the reference of the object id is copied in formal parameters.
  - **Primitive data types are passed by value and the objects are passed by reference**.
- **Method overloading**
  - Writing more than one method having same names but different parameter list or data types.
  - Compiler will call the corresponding method depending upon the parameter list.
- **Variable arguments**
  - It is nothing but writing a single method which can run for number of parameters of same data types.
  - `…` represents the variable arguments.
  - The parameters passed are converted into an array.
  - The parameters can be directly passed using an anonymous array.
  - Variable argument should always be the last parameter.
- **Command line arguments**: Dos file is used for command line arguments.
- **Recursion**

```

# Beginning of programming
 ######## Monolithic Program ########
#   ...                             #
#   ...                             #
#   ...                             #
#   ...                             #
#   ...                             #
#                                   #
 ###################################

# Idea of breaking up the program into modules
########## Modular Program ##########
#                                   #
#             main                  #
#               |                   #
#    _______________________        #
#   |       |       |       |       #
# module  module  module  module    #
#                                   #
 ###################################

# Function is not the correct term for OOP
# Method is the correct term
############### Class ###############
#                                   #
#             Data                  #
#               |                   #
#    _______________________        #
#   |       |       |       |       #
# Method  Method  Method  Method    #
#                                   #
 ###################################

```

&nbsp;

# \_10oop

- **Principles**
  - **Abstraction** means hiding internal details and showing the required things.
  - **Encapsulation** is the process of grouping data in a single section.
  - **Inheritance** means designing an object or a class by re-using the properties of the existing class and object. It is same as specialization.
  - **Polymorphism** is a concept in which we can execute a single operation in different ways. It is same as generalization.
- **Class VS Object**
  - Object is defined in terms of its **properties** and **behavior**.
  - Operation of behaviors will affect the properties.
  - Anything in the world can be defined in the terms of properties and behavior.
  - For a single class we can have many objects.
- In java there is an area inside **main memory** which is known as [method area](https://www.baeldung.com/java-jvm-run-time-data-areas#2-method-area) which contains all the methods.
- The definitions of the methods will be present inside the **heap**, as the objects will be based on the definitions so the objects are also present in heap.
- **Data Hiding**
  - Usually data is hidden and the operations are made visible and operations or methods are performed over the data.
  - e.g. Actual operation of the television is performed in the circuitry which is done by pressing a button.so the circuitry is data and operations are methods where the data is hidden inside the box.
- **Types of Properties**
  - Read and writable
  - Read
  - Write
- **Constructor**
  - A method is required for **initialization of properties** at the time of construction of an object, this method is known as constructor.
  - **Constructor is a method of class called when an object is created.**
  - Every class will have a **default constructor** provided by java compiler.
  - Constructor will not have any return type.
  - 2 types of constructors
    - Parameterized
    - Non-parameterized
  - Non-parameterized constructors is a replacement for default constructors.
  - Constructors can be overloaded.

&nbsp;

# \_11inheritance

- Common thing in generalization and specialization is they are in the form of **hierarchy**.
- It is Like a parent class and child class (or) base class and derived class(or) super class and sub class.
- **Generalization**
  - In Generalization group of classes are referred with super class with single name.
  - Generalization means **bottom up**.
  - In Generalization, a **super class** is made by grouping multiple **sub classes**.
  - Generalization is achieved using **interfaces**
  - For achieving generalization, **abstract classes** are used.
- **Specialization**
  - In Specialization a new sub class is generated by borrowing the features of existing **concrete class** and **adding new features** to it.
  - Specialization means **top down**.
  - In specialization a new class is derived from an existing **super class**.
  - Specialization is achieved using **inheritance**.

```

                            Generalization

      Smart Phone            Vehicle                     Shape
           |                    |                          |
    ---------------        ------------          ---------------------
   |       |      |        |    |     |          |         |         |
iPhone  Samsung  Vivo     Car  Bike  Ship     Triangle  Rectangle  Circle



                            Specialization

                    iPhone      Circle          Guitar
                      |           |               |
                  iPhoneXS    Cylinder     Electric Guitar

```

- **Inheritance**
  - Inheritance is the process of **acquiring features of an existing class into a new class**.
  - A class will have properties and method.
- **Method Overriding**
  - RedePining the method of the Super Class in the Sub Class.
  - Method will be called depending on the object.
  - Method overriding is achieved in Inheritance.
- In Java, a superclass reference variable can point to an object of its subclass. This feature allows Java to achieve **polymorphism**.
- When you declare a variable with the type of a superclass, it means that the variable can reference any object of that superclass or its subclasses.
- An object of a subclass is an instance of that subclass but also an instance of its superclass due to inheritance.
- **Dynamic Method Dispatch**
  - It is useful for achieving Runtime Polymorphism.

&nbsp;

# \_12abstractClasses

- If abstract keyword is used before the class then it is an **abstract class** if nothing is written before class then it is a **concrete class**
- Object of an abstract class cannot be created but object of concrete class can be created
- Reference of abstract class is allowed
- The abstract method is **undefined** method
- **Abstract classes are used for imposing standards and sharing methods**
- Sub classes are meant for following standards

&nbsp;

# \_13interfaces

- **Inheritance is used for borrowing methods.**
- **Abstract** is used for achieving **polymorphism** as well as **inheritance**.
- Inheritance is **completely used** for achieving Polymorphism.
- Interface can be call as abstract class with all abstract methods.
- All the methods are by default abstract.
- **Classes are extended but interfaces are implemented.**
- In Interface we can have reference of interface and the object of the class which is implemented.
- **Interface VS Multiple Inheritance**
  - In C++ one class can inherit from multiple classes.
  - **Multiple inheritance in java** is achieved using `interfaces`.
  - Interfaces are perfect than using multiple inheritance.
  - Way of thinking in java is more perfect than C++.

&nbsp;

# \_14innerClasses

- Nested inner class
- Local inner class
- Anonymous inner class
- Static inner class

```md
Inner classes may initially appear to add complexity to code, but they do have several advantages, especially in specific scenarios where encapsulation, readability, or event handling is critical. Here are some of the benefits of using inner classes:

### Encapsulation

1. **Data Hiding**: Inner classes can access private members of the outer class, which is useful for encapsulating related functionalities together. This improves the robustness of the program.

2. **Single Responsibility Principle**: Sometimes an outer class needs to perform tasks that are auxiliary to its main role. These tasks can be delegated to an inner class, ensuring that each class stays focused on a single responsibility.

### Readability and Maintenance

1. **Localized Scope**: Inner classes help to keep the code more readable and maintainable. If a class is useful to only one other class, it's more logical to keep the two nested together. This makes the code easier to understand and manage.

2. **Less Code**: Inner classes can reduce code length because they have access to the private variables and methods of the outer class. You don't need to create explicit methods to access those variables, reducing boilerplate code.

3. **Logical Grouping**: Inner classes group classes and interfaces logically, which is useful for development and packaging, improving code maintainability.

### Design Patterns and Frameworks

1. **Facilitates Design Patterns**: Some design patterns, like the Builder Pattern or the Strategy Pattern, can be more cleanly implemented with the help of inner classes.

2. **Event Handling**: In graphical applications, inner classes are often used to handle events, as they can access the private fields of the graphical components. This is seen commonly in Java GUI development with Swing or JavaFX.

### Instantiation and Anonymity

1. **Multiple Instances**: An inner class can be instantiated multiple times within an outer class instance, allowing for complex data structures and algorithms that involve multiple, independently configured objects of the same class type.

2. **Anonymous Classes**: Java allows the definition of anonymous inner classes (a specialized kind of inner class without a name) which can simplify code when implementing interfaces on the fly, often seen in GUI programming or Thread implementation.

3. **Enhanced Security**: The inner class is only accessible through the outer class, which can serve as a security mechanism for sensitive operations or data.

While inner classes are not suitable for every situation, they offer a set of powerful tools for specific tasks that can make your code cleaner, more understandable, and more maintainable when used appropriately.
```

```md
Local and anonymous inner classes are special kinds of inner classes in Java that allow you to define classes within methods or blocks of code, rather than within other classes. Here's a breakdown of each:

### Local Inner Class

1. **Definition**: A local inner class is defined within a method of an outer class.

2. **Visibility**: It is not visible outside that method, meaning you can't create an instance of a local inner class outside the method where it's defined.

3. **Access to Local Variables**: A local inner class can access both final and effectively final variables of the enclosing method. "Effectively final" means the variable's value doesn't change once it's set.

4. **No Access Modifier**: A local inner class can't have static variables or methods, and it can't have public, private, protected, or static access modifiers.

5. **Purpose**: Local inner classes are useful for implementing functionality that is only required temporarily and is not reused elsewhere, making the code easier to read and maintain.

### Anonymous Inner Class

1. **Definition**: An anonymous inner class is an unnamed class defined on the fly, usually for immediate instantiation and usage, such as for method arguments.

2. **Limited Scope**: Like local inner classes, anonymous inner classes also have a limited scope, but they're even more restricted because they have no name.

3. **No Constructor**: They don’t have named constructors because they don’t have a name.

4. **Implementation on the Fly**: They're often used for instantiating interfaces or extending classes on the fly for quick method implementations, especially in GUIs.

5. **Single Use**: They're good for single-use / one-time tasks.

### When to Use

1. **Local Inner Class**: When a specific functionality is needed only within a particular method and needs access to local variables.

2. **Anonymous Inner Class**: For very specific, often one-time, tasks such as event handling in GUI applications or quick and dirty implementations of interface methods.

Both types aim to increase encapsulation and readability by reducing the visibility and lifetime of the class. They allow you to put the definition of a class close to where it is actually used, which can make the code more maintainable and clear.
```

&nbsp;

# \_15staticAndFinal

- **Static Members**
  - Static Keyword is used for representing **meta data** (data about data).
  - It is useful for representing the information of a class.
  - Static members belongs to a class and they can be **shared by all the objects of the class** and all the objects have their own non-static members.
  - All the object can use the static variable as a shared data.
  - Static members can be accessed just by using class name.
  - The static members of a class are created in the method area.
  - Static methods can access only static members.
- **Static Blocks**
  - Set of statements are written in the form of blocks and are made static.
  - It is used to initialize static data member.
  - It is executed before the main method at the time of class loading
- **Final Members**
  - Values of final variables are fixed, once the value is assigned then it can’t be modified.
  - Final variables are written in **CAPITAL LETTERS**.
  - Final variable can be initialized while declaring the variable, or it can be initialized in a statiC block, or else it can be initialized inside constructor of a class.
  - As constructors can be overloaded then the final variable must be initialized in every constructor
  - Final method cannot be overridden.
  - A final class cannot be extended.
- **Singleton Class**
  - A class which can create only one object is called singleton class.
  - Constructors are made private to and object of the singleton class is written in static method.
  - In singleton class getInstance() method is used.

&nbsp;

# \_16packages

```sh
# Create a directory for package
javac -d . <filename>
```

|        Access</br>Modifiers         | `default` | `private` | `protected` | `public` |
| :---------------------------------: | :-------: | :-------: | :---------: | :------: |
|             Same Class              |     ✓     |     ✓     |      ✓      |    ✓     |
|     Same Package</br>Sub Class      |     ✓     |     ⤫     |      ✓      |    ✓     |
|   Same Package</br>Non-Sub Class    |     ✓     |     ⤫     |      ✓      |    ✓     |
|   Different Package</br>Sub Class   |     ⤫     |     ⤫     |      ✓      |    ✓     |
| Different Package</br>Non-Sub Class |     ⤫     |     ⤫     |      ⤫      |    ✓     |

- **Naming Convention**
- https://www.citibank.com
- Package 1: com.citibank.accounts
- Package 2: com.citibank.loans

&nbsp;

# \_18exceptionHandling

- **Programmers**
  - **Syntax Error**
    - Prompt by compilers
  - **Logical Error**
    - Trace errors using a debugger
- **Users**
  - **Runtime Error**
    - **Exceptions** are runtime errors
    - Mishandling of a program
    - Causes of runtime errors are **bad input** and **unavailability of resources**
    - Major problems with runtime errors is program will crash
    - Exception handling is process of responding to the runtime errors
- **Try with Resources**
  - All the things that are outside the program are resource to a program
  - **Heap** is also a resource to a program
  - Whenever a program needs a resource it should acquire it and when do not need we should return it
  - **To write an object in heap we write new**
  - In java heap memory objects are unallocated automatically by garbage collector

&nbsp;

# \_19multithreading

## Threads

- **What is multi programming?**
  - Running more than one program that is running multiple programs on a single machine or a computer is known as multi-programming
  - The idea of multiprogramming started from the utilization of the CPU when it is idle as the CPU works for just few time in the whole hour
  - There are different form of multi-programming
- **Multi-user**: more than one user using the machine / running their programs simultaneously
  - For connecting more than one user to single computer the **dummy terminals** were used
  - Here the **round robin** fashion was introduced as the programs were executed simultaneously
  - Unix and Linux are famous operating systems for the multi-user environment
  - Multi-user machines were known as time sharing machines
- **Multi-Tasking**: single user runs multiple tasks simultaneously
  - Here the CPU runs the programs alternatively on high rate
  - Windows and MacOS(OS X) operating system supports this type of environment
- **Multi-Threading**: it is a type of multi-threading where there are different tasks going on under a single application.
  - Threads are light weighted compared to the task
  - CPU runs the threads alternatively where the user fells the threads running all together
  - Examples: animation, application, gaming, websites & web servers
- **States Of A Thread**
  - The first state of the thread is new it stores the object of the thread
  - To run the object of thread the start method is called
  - When start method is called then it is entered into the ready state where it is ready to run
  - Then it enters into the running state
  - After completing the task it will enter into the terminated state
  - A thread which is terminated is just like a thread which is killed
  - Therefore the different states of thread are
    - New
    - Ready
    - Running
    - Terminated
  - While running the thread may also enter into different states like:
    - **Wait State**: waiting for acquiring some resource or made to wait by some other thread
    - **Time Wait State**: to make the thread to delay for some time using the sleep method, it is also known as sleep state
    - **Wait and Notify**: where the thread is to be in the waiting state to get to its chance till it gets notified.
    - **Blocked State**: it is just like entering into the monitor where the thread is being locked for some time, it is similar to waiting state.
- **Thread Priorities**
  - Java supports thread priorities from 1-10
  - Execution of threads depends upon scheduler
  - If a thread is having higher priority then it should get some preference over other threads
  - In java there are different levels of priority that are:
    - MIN_PRIORITY=1
    - NORM_PRIORITY=5
    - MAX_PRIORITY=10
- **Thread Class**
  - Object of the thread class can be created
  - Whenever a thread is created it gets some IDE
  - Threads can be identified by mentioning their names
  - There are different constructors to give the thread classes:
    - `Thread()`: It is a default class
    - `Thread(Runnable r)`: The thread contains the runnable interface
    - `Thread(Runnable r, String name)`: The thread class have its own name with runnable interface
    - `Thread(ThreadGroup g, String name)`: Thread group to manage various threads together
  - Getter and setter methods
  - Instance methods

```md
In Java, a daemon thread is a thread that runs in the background and does not prevent the JVM from exiting when the program finishes. The lifecycle of a daemon thread is somewhat similar to a user (non-daemon) thread but with a key difference in its termination behavior.

Here's a summary of the lifecycle of a daemon thread:

1. **New**: When a thread is created, it is in the "New" state. At this point, the thread has not yet started executing.

2. **Runnable**: After the `start()` method is called, the thread becomes "Runnable." It might or might not be running at this point; it's up to the thread scheduler to give it time to execute.

3. **Running**: Once the thread scheduler has allocated CPU time to the thread, it is actually running. This is where the `run()` method gets executed.

4. **Blocked/Waiting**: A daemon thread can also be in a "Blocked" or "Waiting" state if it is waiting for some resource or another operation to complete. Unlike user threads, daemon threads are not considered in the calculation to determine if the application should terminate.

5. **Terminated**: The thread is "Terminated" when its `run()` method completes execution or when the thread is explicitly stopped. In the case of daemon threads, they are also terminated when all the user threads in the program are finished. This is the key difference between user threads and daemon threads. If the JVM finds that only daemon threads are running, it terminates them and exits the program.
```

## Synchronization

Synchronization in Java is used to regulate access to shared resources among multiple threads. Below are various topics associated with multithreading synchronization:

### Resource Sharing

In a multithreaded environment, threads often share resources like data structures, files, or network connections. Sharing these resources without proper management can lead to inconsistencies. If an object exists in the heap and can be accessed by multiple threads, then that object becomes a shared resource.

### Critical Section

A critical section is a piece of code where a thread interacts with shared resources. Only one thread should execute the critical section at a given time, or else it can lead to a race condition. In Java, you can define a critical section by using the `synchronized` keyword.

```java
synchronized(object) {
  // Critical section
}
```

&nbsp;

<figure>
    <img src="src/_00diagrams/multithreading_critical_section.png"
         alt="multithreading_critical_section">
    <figcaption>Critical Section</figcaption>
</figure>

&nbsp;

### Mutual Exclusion

Mutual exclusion ensures that only one thread can execute the critical section at a given time. In Java, mutual exclusion can be implemented using synchronized methods or synchronized blocks.

### Locking/Mutex

A mutex (mutual exclusion) is a locking mechanism used to synchronize access to a resource. In Java, the `java.util.concurrent.locks.Lock` interface provides more advanced locking capabilities than the `synchronized` keyword, like reentrant locks via `ReentrantLock`.

If the mutex variable is set to zero, then it is free and unoccupied. When one thread finishes its time period, another thread cannot access the object because the mutex will no longer be zero. A second thread can access the object if and only if the mutex returns to zero.

For every shared resource, there should be a lock that is applied by the thread itself. In this context, the threads are responsible for mutual exclusion. Mutexes are ineffective if the threads overlap each other because the first thread has not locked the mutex.

```java
Lock lock = new ReentrantLock();
lock.lock();
try {
  // Critical section
} finally {
  lock.unlock();
}
```

![multithreading_mutex](src/_00diagrams/multithreading_mutex.png)

### Semaphore

Semaphores are used to control the number of threads that can access a particular resource at a given time. Java provides a `Semaphore` class in `java.util.concurrent` package for semaphore-based control.

It was similar to an operating system before the introduction of Java, designed to control the coordination of threads so that they would not overlap. This system was supported by the UNIX operating system. The semaphore creates a scenario in which the thread occupying the object signals the others after its work is complete. This forms a blocked queue where upcoming threads remain in a waiting state. The methods used for this are `wait()` and `signal()`. In this setup, the operating system enforces mutual exclusion.

```java
Semaphore semaphore = new Semaphore(1);
semaphore.acquire();
try {
  // Critical section
} finally {
  semaphore.release();
}
```

### Monitor

In Java, every object has an implicit monitor lock (or mutex), and a thread can lock or unlock it by using synchronized methods or blocks. Only one thread can hold the object's monitor at a time.

Here, the object itself assumes responsibility for mutual exclusion, which can be achieved using object orientation. The complete mechanism resides within the object. The read and write methods, the data, and the blocked queue all belong to the shared object, as they can be accessed by any thread at a given time. In this setup, Java ensures that only one thread has access at a time.

![multithreading_monitor](src/_00diagrams/multithreading_monitor.png)

### Race Condition

A race condition occurs when two or more threads can access shared data and at least one thread modifies it, causing unpredictable behavior. Race conditions can be avoided using various synchronization mechanisms like `synchronized` blocks, Locks, Semaphores, etc.

There is a single producer thread and multiple consumer threads. The consumers do not execute simultaneously; they operate in a round-robin fashion. When the count is zero, it's the producer's turn; when the count is not zero, it's the consumers' turn. Since there is more than one consumer, any consumer can access the resource. The `notify` method can unblock any thread, as they may not be in a specific order. The race condition occurs when one thread is accessing the shared resource while all others are blocked. Once the active thread has completed its work, it informs the other threads, and any of them may access the object, much like in a race. In the scenario described above, the count method is used to control this race condition, which can be avoided through inter-thread synchronization.

### Inter-Thread Communication

Java supports inter-thread communication using `wait()`, `notify()`, and `notifyAll()` methods. These methods are used to allow synchronized threads to communicate about the state of a resource.

- `wait()`: Causes the current thread to wait until another thread invokes the `notify()` or `notifyAll()` method for the same object.
- `notify()`: Wakes up a single waiting thread that is waiting on the same object's monitor.
- `notifyAll()`: Wakes up all the threads that are waiting on the same object's monitor.

```java
synchronized(object) {
  while (<condition does not hold>) {
    object.wait();
  }
  // Perform action
  object.notifyAll();
}
```

![multithreading_inter_thread_communication](src/_00diagrams/multithreading_inter_thread_communication.png)

The communication occurs between synchronized threads, specifically between a single producer thread and a consumer thread. Inter-thread communication refers to the synchronization between the producer and consumer threads for simultaneous access to the read and write methods. To facilitate this communication, the flags `Flag=t` and `Flag=f` are used.

&nbsp;

# \_20javaLangPkg

## Object Class

- The `Object` class is the parent class for all classes in Java.
- It is sometimes referred to as the mother of all classes in Java.
- Even user-defined classes implicitly inherit from the `Object` class.

## Wrapper Class

- Java provides wrapper classes for primitive types so that they can be treated as objects.
- There is a wrapper class for each primitive data type.
- The process of converting a primitive type to its object representation is known as boxing.
- All these classes reside in the `java.lang` package.
- `Number`, `Character`, and `Boolean` are subclasses of the `Object` class.
  - Number class
  - Integer class
  - Byte class
  - Long class
  - Short class
  - Float class
  - Double class
  - Character class
  - Boolean class
- AutoBoxing and AutoUnboxing are features that allow automatic conversion between primitive types and their corresponding object wrapper classes.

## String vs StringBuffer vs StringBuilder

- `String` objects are immutable.
- `StringBuffer` is similar to `String` but is mutable.
  - It does not return a new object when modified.
  - Characters can be appended or inserted at a specific index.
  - Since it's mutable, the above operations modify the existing `StringBuffer` object.
  - The length of the content within the `StringBuffer` may be less than its capacity.
  - The default capacity of `StringBuffer` is 16.
  - The capacity can automatically adjust based on the content.
  - Only one thread can operate on a `StringBuffer` at a given time, making it thread-safe.
  - Due to this synchronization, `StringBuffer` methods are synchronized.
- `StringBuilder` is similar to `StringBuffer`, but it is not thread-safe.
  - `StringBuilder` is generally faster than `StringBuffer`.
  - `StringBuilder` can be used in place of `StringBuffer` when only a single thread is involved.

## Enum

- It is used to define our own data types or to define an enumerated data type.
- We can have pre-defined constants using `enum` in Java.
- Enums are defined similarly to classes.
- Interfaces can have final and static members.
- `Enum` is directly inherited from the `Enum` object in the `java.lang` package.
- It can also have other methods as well as constructors. Constructors must be either public or protected.
- All the identifiers are created when the `enum` class is loaded.

## Reflect Package

- Java has a package called `java.lang.reflect` that contains a diverse set of classes.
- The classes in the reflection package help us retrieve information or definitions about a class.

&nbsp;

# \_21annotationsAndJavaDoc

- [Oracle - Java Documentation](https://docs.oracle.com/en/java/)
- Java provides tags for documentation known as the `javadoc` tool.
- `javadoc -d docs _01Book.java`

|  Class   |   Method    | Others  |
| :------: | :---------: | :-----: |
| @author  |   @param    |  @link  |
| @version |   @return   | @value  |
|  @since  |   @throw    | @serial |
|   @see   | @exception  |         |
|          | @deprecated |         |
|          |    @code    |         |

## Annotations

- Annotations are used for defining attributes for a class, interface, or methods.
- Annotations provide metadata to a class, interface, or method.
  - **Applied to code**: These annotations are applied to the code. They provide hints to the compiler, allowing it to avoid showing errors and warnings. The in-built annotations applied to the code include:
    - **@Override**: Informs the compiler that the element is meant to override an element declared in a superclass.
    - **@Deprecated**: Indicates that the marked element is deprecated and should no longer be used.
    - **@FunctionalInterface**: Indicates that the type declaration is intended to be a functional interface.
    - **@SuppressWarnings**: Tells the compiler to suppress specific warnings that it would otherwise generate.
    - **@SafeVarargs**: When applied to a method or a constructor, it asserts that the code does not perform potentially unsafe operations on its `varargs` parameter.
  - **Applied to other annotations**: These annotations are applied to user-defined annotations. They include:
    - **@Retention**: Specifies how the marked annotations are stored.
    - **@Documented**: Indicates that elements annotated with the specified annotation should be documented using the `javadoc` tool.
    - **@Target**: Marks another annotation to restrict what kind of Java elements can be applied to.
    - **@Inherited**: Indicates that the annotation type can be inherited from the superclass.
    - **@Repeatable**: Indicates that the marked annotation can be applied more than once to the same declaration or type.
- **Metadata** is "data that provides information about other data". In other words, it is "data about data."

&nbsp;

# \_22lambdaExpressions

- Lambda expressions are used for defining anonymous expressions or nameless methods/functions.
- Lambda expressions are defined with the aid of interfaces.
- If an interface has a single abstract method, then it is referred to as a **functional interface**.
- The symbol for lambda expression is `->`.
- Lambda expressions are powerful, useful, and convenient for programmers.
- In Java's lambda expressions, "capture" refers to the ability of a lambda to access variables from its enclosing scope. Lambdas in Java have the capability to "capture" (or "close over") variables from their enclosing contexts. However, there are specific rules governing this:
  - **Local Variables**:
  - A lambda can capture local variables from its enclosing scope.
  - The captured local variables must be **effectively final** or actually declared `final`. An "effectively final" variable is one that's not modified after it's assigned a value.
  - The lambda expression does not actually store the value of the local variable but rather a reference to it.
- **Instance and Static Variables**:
  - Lambdas can also capture instance variables (fields) and static variables. Unlike local variables, there's no "effectively final" restriction on these. The lambda has both read and write access to these variables.
- **`this` Reference**:
  - Within a lambda expression, the `this` keyword refers to the `this` of the enclosing scope (not the lambda itself, since lambdas don't have a `this`). So, lambdas can access instance methods and instance variables of the enclosing class using the `this` reference.

&nbsp;

# \_23javaIOStreams

![java_io_streams](src/_00diagrams/java_io_streams.png)

- **Byte Stream**
  - Input Stream
  - Output Stream
- **Character Stream** (2 bytes)
  - Reader
  - Writer

```md
Both `FileInputStream` and `FileReader` are classes in Java that allow you to read data from a file, but they are designed for slightly different purposes:

1. **FileInputStream**:

   - **Nature**: It is a byte stream class.
   - **Usage**: Designed to read raw bytes from a file. Useful for binary files like images, audio files, etc.
   - **Methods**: Uses methods like `read()` which read and return bytes.
   - **Character Encoding**: Doesn't handle character encoding; it's a straightforward byte-to-byte read. If you use it for text files, you'll have to manage character encoding yourself if necessary.

2. **FileReader**:
   - **Nature**: It is a character stream class.
   - **Usage**: Designed to read text files. It reads characters and automatically translates them based on the default character encoding or a specified one.
   - **Methods**: Uses methods like `read()` which read and return characters.
   - **Character Encoding**: Manages character encoding translation for you. By default, it uses the default character encoding of the system it's running on.

**When to Use Which**:

- If you're dealing with **binary data** (like an image or an audio file), you should use `FileInputStream`.
- If you're dealing with **textual data** and want to handle character encoding more easily, you should use `FileReader`.

The key takeaway is to choose the appropriate class based on the type of data you're reading and whether you want automatic handling of character encoding.
```

&nbsp;

# \_24generics

Common drawback of using the general `Object` class for type generalization in Java.

1. **Type Safety**: By assigning everything to an `Object`, you lose type safety. In the code:

   ```java
   Object obj = new String("Hello");
   obj = Integer.valueOf(10);
   ```

   The `obj` reference can refer to any object. First, it's assigned a `String`, then an `Integer`. This flexibility means you don't have compile-time checks to ensure that you're working with the expected type of data.

2. **Type Casting**: Because you're using `Object` for everything, you're forced to cast the object back to its original type when you want to use it as that type:

   ```java
   String str = (String) obj;
   ```

   This can lead to runtime errors. In this case, the code will throw a `ClassCastException` at runtime because you're trying to cast an `Integer` to a `String`.

   ```java
   // Another example: Array of objects
   Object obj[] = new Object[3];
   obj[0] = "zero";
   obj[1] = "one";
   obj[2] = Integer.valueOf(2);

   String str;

   // Runtime error for `obj[2]`
   // class java.lang.Integer cannot be cast to class java.lang.String
   for (int i = 0; i < obj.length; i++) {
   str = (String) obj[i];
   System.out.println(str);
   }
   ```

3. **Maintenance and Readability Issues**: Using `Object` as a general type makes the code harder to read and maintain. Anyone reading the code will not immediately know what type of object `obj` is expected to be. They have to trace the code to see where `obj` is being used, and what it's being cast to, to understand its intended use.

4. **Loss of Specific Operations**: When you refer to specialized objects like `String` or `Integer` as `Object`, you lose access to their specific methods unless you cast them back. This means that operations that are specific to `String` or `Integer` are not directly accessible from the `obj` reference.

Using generics, introduced in Java 5, alleviates these issues by allowing you to create generalized classes, interfaces, and methods while maintaining type safety. Generics provide compile-time type checking without the need for excessive casting or the risk of `ClassCastException` at runtime.

&nbsp;

---

&nbsp;

The `ArrayList` class and the `Object` class serve very different purposes in Java, and while there might seem to be some overlap in terms of allowing for a general storage of "any type," their roles in the language are distinct. Here are the reasons why both exist and are still relevant:

1. **Historical Reasons**:

   - Before generics were introduced in Java 5, the standard way to handle a general object in a collection (like `ArrayList`) was to use `Object`. This allowed collections to store any type of object, but at the cost of type safety.
   - Even with the introduction of generics, the `Object` class remains an integral part of Java's type system.

2. **Object is the Ultimate Base Class**:

   - Every class in Java implicitly inherits from the `Object` class if it doesn't extend another class. This makes `Object` the ultimate base class for all Java objects.
   - This design provides a few default behaviors and methods (like `toString()`, `hashCode()`, `equals()`, etc.) for every object in Java.

3. **General Programming Paradigms**:

   - There are scenarios where you might not care about the type of object you're working with, and `Object` is the most general type available.
   - It's useful in certain design patterns and APIs where a general object type is needed.

4. **Interoperability with Older Code**:

   - There's a lot of existing Java code (written before generics were introduced) that uses `Object` to handle general objects.
   - Removing or de-emphasizing `Object` would break backward compatibility, which is a key concern for Java's design philosophy.

5. **`ArrayList` vs. `Object`**:

   - `ArrayList` is a data structure designed to hold a collection of objects, whereas `Object` is a base class for all objects.
   - An `ArrayList` without generics essentially holds an array of `Object` references, allowing it to store any type of object. With generics, it provides type safety.

6. **Performance Considerations**:
   - There are times when using an array of `Object` might be more performance-efficient than using an `ArrayList`, especially when you're not adding or removing elements frequently and when you want to avoid the overhead introduced by the `ArrayList` class.

In summary, while `ArrayList` (and other collections) with generics offer a more modern and type-safe way to handle collections of objects, the `Object` class remains a foundational piece of the Java language and serves various roles that can't be replicated solely by generic collections.

&nbsp;

---

&nbsp;

**No Parameter**:

- **Description**: Generics without parameters, commonly known as raw types, defeat the purpose of generics, which is to provide type safety.
- **Example**:
  ```java
  ArrayList list = new ArrayList();  // This is a raw type
  list.add("Hello");
  list.add(42);  // No compile-time error, but could lead to runtime errors
  ```
- **Best Practices**:
  - Avoid using raw types. Always specify a type parameter when using generics.
  - Using raw types leads to warnings and removes the type safety benefits of generics.

&nbsp;

**Multiple Parameters**:

- **Description**: You can define generics with multiple type parameters.
- **Example**:

  ```java
  public class Pair<K, V> {
      private K key;
      private V value;

      public Pair(K key, V value) {
          this.key = key;
          this.value = value;
      }
      // ... getters and setters
  }

  Pair<String, Integer> age = new Pair<>("Alice", 30);
  ```

- **Best Practices**:
  - Provide meaningful names for type parameters. Conventionally, single uppercase letters are used (like `T`, `E`, `K`, `V`, etc.), but meaningful names can be more readable in complex scenarios.

&nbsp;

**Subtypes**:

- **Description**: In generics, by default, type parameters are invariant.
- **Example**:
  ```java
  List<String> strings = new ArrayList<>();
  List<Object> objects = strings;  // This will cause a compile-time error
  ```
- **Best Practices**:
  - Use the PECS rule (Producer `extends`, Consumer `super`).

&nbsp;

**Bounded Types**:

- **Description**: Bounded type parameters limit the types that can be used with generics.
- **Example**:

  ```java
  public class Box<T extends Number> {
      private T value;

      public Box(T value) {
          this.value = value;
      }
      // ... getters and setters
  }

  Box<Integer> intBox = new Box<>(10);
  ```

- **Best Practices**:
  - Use bounded types to ensure that the generic type adheres to specific behaviors or APIs.
  - Use bounded types sparingly to maintain the reusability of your generic classes or methods.

&nbsp;

**Upper Bound**:

- **Description**: An upper bound restricts the generic type to a particular type or its subtypes.
- **Example**:

  ```java
  public class Container<T extends Comparable<T>> {
      private T value;

      public Container(T value) {
          this.value = value;
      }

      public int compareTo(Container<T> other) {
          return value.compareTo(other.value);
      }
  }

  Container<String> strContainer = new Container<>("Hello");
  Container<Integer> intContainer = new Container<>(5);
  ```

- **Best Practices**:
  - Ensure that the restricted type or interface makes logical sense for your generic class or method's intended functionality.

&nbsp;

**Lower Bound**:

- **Description**: Lower bounds restrict the generic type to a particular type or its super types.
- **Example**:

  ```java
  public void addNumbers(List<? super Integer> list) {
      for (int i = 0; i < 10; i++) {
          list.add(i);
      }
  }

  List<Number> numbers = new ArrayList<>();
  addNumbers(numbers);
  ```

- **Best Practices**:
  - Use lower bounds when you need to write data into a structure and want to ensure type safety.

&nbsp;

**Real-World Examples**:

- **No Parameter**: Legacy code before generics were introduced in Java 5 uses raw types.
- **Multiple Parameters**: Java's `Map<K, V>` interface, where `K` stands for key and `V` stands for value.
- **Subtypes**: A method that processes lists of any type of number: `processNumbers(List<? extends Number> numbers)`.
- **Bounded Types**: A library for geometric shapes might have: `public <T extends Shape> void draw(T shape)`.
- **Upper Bound**: Java's Collections API method: `public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll)`.
- **Lower Bound**: A system that accumulates error messages might use: `addErrorMessages(List<? super String> list)`.

&nbsp;

**Do's and Don'ts in Generics**

1. Only `extends` is allowed in a generic class definition.
2. `extends` can be used for interfaces as well.
3. A class can `extends` from only one class but can implement multiple interfaces.
4. Both `extends` and `super` are allowed with `?` in method signatures.
5. `<?>` will accept all types, but specific operations on these types might be restricted.
6. The base type of an object should be the same as specified or `?`.

&nbsp;

# \_25collectionFramework

![collection_framework](src/_00diagrams/collection_framework.svg)

- [Java 21 - Collections](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/doc-files/coll-overview.html)

&nbsp;
