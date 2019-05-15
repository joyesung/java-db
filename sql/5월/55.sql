DROP PROCEDURE IF EXISTS search_user;
 DELIMITER // /*밑에서 //가 나올때까지 쿼리문이 시작하지 않는다.*/
 CREATE PROCEDURE search_user() 
 BEGIN 
 SELECT USER,HOST FROM MYSQL.USER; 
 END // 
 DELIMITER ;
 show procedure status;


