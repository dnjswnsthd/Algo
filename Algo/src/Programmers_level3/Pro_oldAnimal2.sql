-- 프로그래머스 코딩테스트 연습 오랜 기간 보호한 동물2
SELECT INS.ANIMAL_ID, INS.NAME
FROM ANIMAL_INS INS JOIN ANIMAL_OUTS OUTS
ON INS.ANIMAL_ID = OUTS.ANIMAL_ID
ORDER BY OUTS.DATETIME - INS.DATETIME DESC LIMIT 2