SELECT ANIMAL_ID, NAME 
FROM ANIMAL_INS 
WHERE Lower(NAME) LIKE '%el%'
and ANIMAL_TYPE = 'Dog'
Order by NAME;