<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Parameter</title>
</head>
<body>
	<h3>파라미터 보내는 폼</h3>
	
	<p>파라미넡로 보내는 name값과 이 값을 받는 모델 클래스의 속성 이름이 일치하면 알아서 자동으로 바인딩해준다</p>
	
	<form action="./parameter" method="POST">
	DEPT_NO: <input type="number" name="department_id" value="50"> <br>
	DEPT_NO: <input type="text" name="department_name" value="It Programmer"> <br>
	DEPT_NO: <input type="number" name="manager_id" value="105"> <br>
	DEPT_NO: <input type="number" name="location_id" value="130"> <br>
	<input type="submit" value="컨트롤러 보내기">
	</form>
	
	<hr>
	
	<form action="./para2" method="POST">
		EMP_ID:<input type="text" name="employee_id" value="135">
		<input type="submit" name="보내기1">
	</form>
	
	<hr>
	
	<form action="./para3" method="POST">
		EMP_ID:<input type="text" name="employee_id" value="122">
		<input type="submit" name="보내기2">
	</form>
	
</body>
</html>