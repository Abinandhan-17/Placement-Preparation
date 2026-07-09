SELECT Department, COUNT(*)
FROM Students
GROUP BY Department
HAVING COUNT(*) > 2;