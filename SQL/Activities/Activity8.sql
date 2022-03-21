REM   Script: Activity_8
REM   Activity_8

Select customer_id, MAX(purchase_amount) as "Maximum" from orders GROUP BY customer_id;

Select salesman_id, order_date, MAX(purchase_amount) FROM orders WHERE order_date=TO_DATE('2012/08/17','YYYY/MM/DD') Group BY salesman_id, order_date;

Select customer_id, MAX(purchase_amount) , order_date From orders Group BY customer_id, order_date  
HAVING MAX(purchase_amount) IN (2030, 3450, 5760, 6000);