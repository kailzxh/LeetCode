# Write your MySQL query statement below
select employee_id , department_id from Employee
where primary_flag=1 or 
employee_id in(select employee_id FROM Employee
        GROUP BY employee_id
        HAVING COUNT(department_id) = 1)
order by employee_id;