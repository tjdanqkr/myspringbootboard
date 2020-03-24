<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="/resource/css/index.css" type="text/css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/login" method="post">
		<input type="text" name="id"> <br>
		<input type="password" name="pass"><br>
		<input type="submit" value="로그인">
		<button><a href="./join">회원가입</a></button>
	</form>
</body>
</html>