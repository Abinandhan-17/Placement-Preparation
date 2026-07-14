SELECT Department, COUNT(*) 
 FROM Employee
GROUP BY Department;

SELECT Department, AVG(Salary) 
 FROM Employee
 GROUP BY Department;