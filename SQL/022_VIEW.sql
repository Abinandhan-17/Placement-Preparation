CREATE TABLE Employee (
    EmpID INT,
    Name VARCHAR(30),
    Department VARCHAR(20),
    Salary INT
);

INSERT INTO Employee VALUES
(101,'Abi','CSE',50000),
(102,'Rahul','ECE',45000),
(103,'Kiran','CSE',55000);

CREATE VIEW CSE_Employees AS
SELECT Name, Salary
FROM Employee
WHERE Department = 'CSE';

SELECT * FROM CSE_Employees;