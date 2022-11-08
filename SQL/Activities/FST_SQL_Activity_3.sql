-- Show data from the salesman_id and city columns
SELECT Salesman_id, Salesman_city FROM Salesman;

-- Show data of salesman from Paris
SELECT * FROM Salesman 
WHERE Salesman_city = 'Paris';

-- Show salesman_id and commission of Paul Adam
SELECT Salesman_id, commission FROM Salesman 
WHERE Salesman_name = 'Paul Adam';

