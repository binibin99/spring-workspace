<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

	<div id="deleteDiv">
		<form id="delForm" action=".board/delete" method="POST">
			<input type="hidden" name="board_id" value="${detail.board_id}">
			<input type="hidden" name="check_password"
				value="${detail.board_password}"> <input id="hiddenPassword"
				type="hidden" name="board_password">
		</form>
	</div>
</body>
</html>