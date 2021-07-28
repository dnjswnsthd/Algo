-- 프로그래머스 입양 시각 구하기

SELECT HOUR(DATETIME) AS hour, COUNT(*) AS count
FROM ANIMAL_OUTS
GROUP BY hour
HAVING hour BETWEEN 9 AND 19
ORDER BY hour ASC;