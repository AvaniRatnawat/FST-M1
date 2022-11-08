-- Write an SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount.
SELECT customer_id,  MAX(Purchase_Amount) AS "Highest Purchase Amount" FROM Orders GROUP BY customer_id;

-- Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
SELECT salesman_id, MAX(Purchase_amount) AS "Highest Purchase Amount" FROM Orders WHERE Order_date = TO_DATE('2012-08-17','YYYY/MM/DD') GROUP BY salesman_id, Order_date;

-- Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list 2030, 3450, 5760, and 6000.
SELECT customer_id, Order_date, MAX(Purchase_amount) AS "Highest Purchase Amount" FROM Orders  
GROUP BY customer_id, order_date 
HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

