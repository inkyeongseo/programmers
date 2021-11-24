SELECT TO_CHAR(DATETIME,'HH24') AS HOUR, COUNT(*) AS COUNT 
FROM ANIMAL_OUTS
WHERE TO_CHAR(DATETIME,'HH24') BETWEEN 09 AND 19
GROUP BY TO_CHAR(DATETIME,'HH24')
ORDER BY TO_CHAR(DATETIME,'HH24');