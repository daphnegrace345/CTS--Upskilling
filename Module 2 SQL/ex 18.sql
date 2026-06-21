-- 18. Resource Availability Check
SELECT title
FROM Events
WHERE event_id NOT IN (
    SELECT DISTINCT event_id FROM Resources
);
