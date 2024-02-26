<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${board.board_id}번글의상세내용</title>
</head>
<body>

	<h3>${board.board_id}</h3>

	<table border="3">
		<tr>
			<th>글번호</th>
			<td>${board.board_id}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${board.view_count}</td>
		</tr>
		<tr>
			<th>글 제목</th>
			<td>${board.board_title}</td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td>${board.board_writer}</td>
		</tr>
		<tr>
			<th>글 내용</th>
			<td>${board.board_content}</td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${board.write_date}</td>
		</tr>
		<tr>
			<th>최근 수정일</th>
			<td>몰라</td>
		</tr>
		<tr>
			<th>첨부 파일</th>
			<td><input type="file" name="attachment"></td>
		</tr>

	</table>

	<div id="replyWriteDiv">
		<form id="replyForm" action="/board/reply/" method="POST">
			<textarea id="replyContent" name="reply_content" rows="5" cols="80"></textarea>
			<br> 댓글쓴이 <input id="replyWriter" type="text"
				name="reply_writer" /> 비밀번호 <input id="replyPassword"
				type="password" name="reply_password" /> <input type="hidden"
				name="board_id" value="${board.board_id}">
			<button id="replyWriteBtn" type="submit">댓글쓰기</button>
		</form>
	</div>
	<h4>댓글 목록</h4>
	<c:forEach var="reply" items="${replies}">
		<table>
			<tr>
				<th>ID</th>
				<td>${reply.reply_writer}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${reply.reply_content}</td>
			</tr>
			<tr>
				<th>날짜</th>
				<td>${reply.reply_date}</td>
			</tr>
		</table>
		<hr>
	</c:forEach>


</body>
</html>
