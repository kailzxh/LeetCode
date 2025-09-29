WITH DuplicateEmails AS (
    SELECT
        id,
        ROW_NUMBER() OVER (PARTITION BY email ORDER BY id) as row_no
    FROM
        Person
)
DELETE FROM Person
WHERE id IN (
    SELECT id
    FROM DuplicateEmails
    WHERE row_no != 1
);