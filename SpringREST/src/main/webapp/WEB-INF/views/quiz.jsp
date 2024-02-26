<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/resources/js/quiz.js" var="quizJS" />
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>신나는 퀴즈</title>
</head>
<body>

	<h1>Quiz</h1>
	
	<h3>
		Quiz. 추첨 버튼을 누르면 랜덤으로 10명의 사원을 골라와서 화면에 출력해주는 
		기능을 만들어보세요 (JSON버전과 XML버전으로 한번씩)
	</h3>
	
	<h3>
		Quiz2. REST방식으로 과일 테이블에 INSERT, UPDATE, DELETE를 구현해보세요
	</h3>
	
	<button id="rbtn1">추첨(JSON)</button>
	<button id="rbtn2">추첨(XML)</button>
	
	<script src="${quizJS}"></script>

</body>
</html>