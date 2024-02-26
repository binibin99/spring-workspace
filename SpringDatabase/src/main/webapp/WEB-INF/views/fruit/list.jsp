<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="UTF-8">
   <title>과일 재고 목록</title>
   <link rel="stylesheet" href="">
</head>
<body>
   <h1>과일 재고</h1>
   <table border="1">
      <tr>
         <th>FRUIT_ID</th>
         <th>FRUIT_NAME</th>
         <th>FRUIT_PRICE</th>
         <th>FRUIT_GRADE</th>
         <th>COUNTRY_ID</th>
         <th></th>
      </tr>
      <c:forEach items="${fruits}" var="fruit">
         <tr>
            <td>${fruit.fruit_id}</td>
            <td>${fruit.fruit_name}</td>
            <td>${fruit.fruit_price}</td>
            <td>${fruit.fruit_grade}</td>
            <td>${fruit.country_id}</td>
            <td><button onclick="location.href='./update?fruit_id=${fruit.fruit_id}'">수정</button></td>
         </tr>
      </c:forEach>
   </table>
   
</body>
</html>