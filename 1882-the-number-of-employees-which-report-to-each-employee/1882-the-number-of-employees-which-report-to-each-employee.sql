select m.employee_id as employee_id,
       m.name as name,
       count(*) as reports_count,
       round(avg(e.age)) as average_age 
from Employees e
join Employees m
     on e.reports_to = m.employee_id
group by m.employee_id, m.name
order by employee_id ;
