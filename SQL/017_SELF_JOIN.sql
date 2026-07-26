SELECT e1.EmployeeName,
       e2.EmployeeName AS Manager
FROM Employees e1
LEFT JOIN Employees e2
ON e1.ManagerID = e2.EmployeeID;