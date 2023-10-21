sqlite3
.help
.databases
.open university.db
.tables
.schema

CREATE TABLE dept(deptNo INTEGER PRIMARY KEY NOT NULL UNIQUE, dName TEXT);
CREATE TABLE students(roll INTEGER PRIMARY KEY, name TEXT, city TEXT, deptNo INTEGER, FOREIGN KEY(deptNo) REFERENCES dept(deptNo));

INSERT INTO dept VALUES(10, 'CSE');
INSERT INTO dept VALUES(20, 'ECE');
INSERT INTO dept VALUES(30, 'Civil');
INSERT INTO dept VALUES(40, 'Mech');
INSERT INTO dept(dName, deptNo) VALUES('Chem', 50);

SELECT * FROM dept;

-- Specific to SQLite
-- Is used to enable foreign key constraint enforcement within the database session.
PRAGMA foreign_keys=ON;

INSERT INTO students VALUES(1, 'Jay', 'New York', 10);
INSERT INTO students VALUES(2, 'Mary', 'Tokyo', 10);
INSERT INTO students VALUES(3, 'Alice', 'London', 20);
INSERT INTO students VALUES(4, 'Bob', 'Paris', 30);
INSERT INTO students VALUES(5, 'Charlie', 'Berlin', 20);
INSERT INTO students VALUES(6, 'David', 'Sydney', 40);
INSERT INTO students VALUES(7, 'Eva', 'Toronto', 10);
INSERT INTO students VALUES(8, 'Fiona', 'San Francisco', 50);
INSERT INTO students VALUES(9, 'George', 'Mumbai', 30);
INSERT INTO students VALUES(10, 'Helen', 'Beijing', 20);
INSERT INTO students VALUES(11, 'Ivy', 'Cairo', 40);
INSERT INTO students VALUES(12, 'Jack', 'Rio de Janeiro', 10);
INSERT INTO students VALUES(13, 'Kevin', 'New York', 10);
INSERT INTO students VALUES(14, 'Laura', 'Tokyo', 20);
INSERT INTO students VALUES(15, 'Mike', 'London', 30);
INSERT INTO students VALUES(16, 'Nina', 'Paris', 40);
INSERT INTO students VALUES(17, 'Oscar', 'Berlin', 10);
INSERT INTO students VALUES(18, 'Paul', 'Sydney', 20);
INSERT INTO students VALUES(19, 'Quincy', 'Toronto', 30);
INSERT INTO students VALUES(20, 'Rachel', 'San Francisco', 40);
INSERT INTO students VALUES(21, 'Steve', 'Mumbai', 10);
INSERT INTO students VALUES(22, 'Tina', 'Beijing', 20);
INSERT INTO students VALUES(23, 'Ursula', 'Cairo', 30);
INSERT INTO students VALUES(24, 'Victor', 'Rio de Janeiro', 40);
INSERT INTO students VALUES(25, 'Wendy', 'New York', 50);
INSERT INTO students VALUES(26, 'Xander', 'Tokyo', 10);
INSERT INTO students VALUES(27, 'Yara', 'London', 20);
INSERT INTO students VALUES(28, 'Zane', 'Paris', 30);
INSERT INTO students VALUES(29, 'Zane', 'London', 30);

SELECT * FROM students;
SELECT NAME FROM students;

-- Select unique combinations of 'name' and 'deptNo' from the 'students' table
SELECT DISTINCT name, deptNo FROM students;

SELECT * FROM students WHERE city='Berlin';

-- Select all records from the 'students' table where the 'city' is not 'Berlin'
SELECT * FROM students WHERE city<>'Berlin';

SELECT * FROM students WHERE deptNo >= 30 and city='Mumbai';
SELECT * FROM students WHERE city IN ('Cairo', 'Rio de Janeiro');

SELECT * FROM students WHERE name LIKE 'A%';
SELECT * FROM students WHERE name LIKE '%y';
SELECT * FROM students WHERE name LIKE '%m%';

SELECT * FROM students S JOIN dept D ON S.deptNo = D.deptNo;

-- Select the count of students and their city, grouped by city,
-- only including cities with 2 or more students
SELECT count(*), city from students GROUP BY city having count(*) >= 2;

-- Select one name for each unique 'deptNo' from the 'students' table
SELECT name, deptNo FROM students GROUP BY deptNo;

-- Aggregate Functions & Set Operations --
SELECT count(*) FROM students;
SELECT count(name) FROM students;
SELECT count(DISTINCT name) FROM students;

SELECT max(deptNo) FROM students;
SELECT sum(deptNo) FROM students;
SELECT avg(deptNo) FROM students;

SELECT count(city), city FROM students GROUP BY city;

SELECT * FROM students WHERE city = 'New York' UNION SELECT * FROM students WHERE city = 'Paris';
SELECT * FROM students WHERE city = 'New York' INTERSECT SELECT * FROM students WHERE city = 'Paris';
SELECT * FROM students WHERE city = 'New York' EXCEPT SELECT * FROM students WHERE city = 'Paris';

-- SubQueries

-- Select all records from the 'students' table where the 'city' matches 
-- the city of the student named 'Xander'
SELECT * FROM students WHERE city IN (SELECT city FROM students WHERE name = 'Xander');

-- Select all records from the 'students' table where 'deptNo' is greater than 
-- the 'deptNo' of the student named 'Quincy'
SELECT * FROM students WHERE deptNo > (SELECT deptNo FROM students WHERE NAME = 'Quincy');

-- DML

SELECT * FROM dept;
INSERT INTO dept values(60, 'EEE');
UPDATE dept SET dName = 'Aero' WHERE deptNo = '60';
DELETE FROM dept WHERE dName = 'Aero';
