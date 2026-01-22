SELECT e.name,b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empID=b.empID
WHERE bonus IS NULL OR bonus<1000