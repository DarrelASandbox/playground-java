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

&nbsp;
