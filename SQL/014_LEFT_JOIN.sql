SELECT e.EmployeeName,d.DepartmentName
FROM Employee e
LEFT JOIN Department d
ON e.DepartmentId = d.DepartmentId;