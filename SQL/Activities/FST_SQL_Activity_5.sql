-- Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

-- Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

-- Update the grade score of Paul Adam to 300.
UPDATE salesman SET grade=300 WHERE salesman_name='Paul Adam';

-- Display modified data
SELECT * FROM salesman;

