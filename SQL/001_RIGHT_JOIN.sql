SELECT Students.name, Marks.mark
FROM Students
RIGHT JOIN Marks
ON Students.id = Marks.id;