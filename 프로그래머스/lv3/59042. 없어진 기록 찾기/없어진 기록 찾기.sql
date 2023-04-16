SELECT B.ANIMAL_ID, B.NAME
FROM ANIMAL_INS A RIGHT JOIN ANIMAL_OUTS B ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE A.DATETIME IS NULL
ORDER BY B.ANIMAL_ID