WITH A AS(
    SELECT LEVEL-1 AS HOUR
    FROM DUAL 
    CONNECT BY LEVEL<25
)

SELECT HOUR, COUNT(B.DATETIME) AS COUNT 
FROM A LEFT JOIN ANIMAL_OUTS B 
ON A.HOUR = TO_CHAR(B.DATETIME,'HH24') 
GROUP BY HOUR 
ORDER BY HOUR;