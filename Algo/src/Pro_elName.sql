-- 프로그래머스 코딩테스트 연습 이름에 el이 들어가는 동물 찾기

SELECT ANIMAL_ID, NAME 
FROM ANIMAL_INS 
WHERE NAME LIKE '%EL%' AND ANIMAL_TYPE = 'Dog' 
ORDER BY NAME