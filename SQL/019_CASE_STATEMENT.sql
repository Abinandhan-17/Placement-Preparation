SELECT Name,
CASE
    WHEN Marks >= 50 THEN 'Pass'
    ELSE 'Fail'
END AS Result
FROM Students;