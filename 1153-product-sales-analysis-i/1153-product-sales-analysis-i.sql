# Write your MySQL query statement below
select product_name , s.year , s.price from Sales s
join Product p ON s.product_id = p.product_id;
