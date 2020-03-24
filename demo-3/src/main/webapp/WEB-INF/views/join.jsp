<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./join" method="post">
	<table>
		<tr><td><h3>아이디</h3></td><td><input name="id" type="text"></td></tr>
		<tr><td><h3>비밀 번호</h3></td><td><input name="pass" type="text"></td></tr>
		<tr><td><h3>이름</h3></td><td><input name="name" type="text"></td></tr>
		<tr><td><h3>이메일</h3></td><td><input name="email" type="text"></td></tr>
		<tr><td><h3>성별</h3></td><td><select name="sex"><option value="남">남자</option><option value="여">여자</option></select></td></tr>
	</table>
	<input type="submit" value="가입">
</form>
</body>
</html>