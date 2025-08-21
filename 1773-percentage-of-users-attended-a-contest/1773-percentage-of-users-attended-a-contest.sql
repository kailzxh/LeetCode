# Write your MySQL query statement below
select contest_id , round(count(distinct r.user_id)*100/(select count(*) from Users),2) as  percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;