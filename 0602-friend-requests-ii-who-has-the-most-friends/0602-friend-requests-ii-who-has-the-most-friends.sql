# Write your MySQL query statement below
SELECT
    id,
    SUM(val) AS num
FROM (
    SELECT accepter_id AS id, COUNT(*) AS val
    FROM RequestAccepted
    GROUP BY accepter_id

    UNION ALL

    SELECT requester_id AS id, COUNT(*) AS val
    FROM RequestAccepted
    GROUP BY requester_id
) t
GROUP BY id
ORDER BY num DESC
LIMIT 1;