-- 코드를 입력하세요
SELECT P.PRODUCT_CODE, SUM(P.PRICE * O.SALES_AMOUNT) SALES
FROM PRODUCT P, OFFLINE_SALE O
WHERE P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY P.PRODUCT_CODE
ORDER BY SALES DESC, P.PRODUCT_CODE
