<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${fruit.fruit_id}번과일수정 페이지</title>
</head>
<body>
   <h3>${fruit.fruit_id}번과일의정보</h3>
   <form action="./update" method="post">
      <table border="3">
         <tr>
            <th>과일번호</th>
            <td>${fruit.fruit_id}<input type="hidden" name="fruit_id"
               value="${fruit.fruit_id}" />
            </td>
         </tr>
         <tr>
            <th>과일이름</th>
            <td><input type="text" name="fruit_name"
               value="${fruit.fruit_name}" /></td>
         </tr>
         <tr>
            <th>과일가격</th>
            <td><input type="number" name="fruit_price"
               value="${fruit.fruit_price}" step="100" /></td>
         </tr>
         <tr>
            <th>과일등급</th>
            <td><c:set value="A+/A/B/C/D" var="grades" /> <select
               name="fruit_grade">
                  <c:forTokens items="${grades }" delims="/" var="grade">
                     <c:choose>
                        <c:when test="${grade == fruit.fruit_grade }">

                           <option value="${grade}" selected>${grade}</option>
                        </c:when>
                        <c:otherwise>
                           <option value="${grade}">${grade }</option>
                        </c:otherwise>
                     </c:choose>
                  </c:forTokens>

            </select></td>
         </tr>
         <tr>
            <th>국가코드</th>
            <td><select name="country_id">
                  <c:forEach items="${countries}" var="country">
                     <option value="${country.country_id }">${country.country_name }</option>
                  </c:forEach>
            </select></td>
         </tr>
         <tr>
            <td colspan="2"><input type="submit" value="수정하기"></td>
         </tr>
      </table>
   </form>

</body>
</html>