REM   Script: Activity_7
REM   Activity_7

SELECT SUM(purchase_amount) as "Total" FROM orders;

SELECT AVG(purchase_amount) as "Average" FROM orders;

SELECT MAX(purchase_amount) as "Maximum" FROM orders;

SELECT MIN(purchase_amount) as "Minimum" FROM orders;

SELECT COUNT(DISTINCT salesman_id) as "Count" FROM orders;