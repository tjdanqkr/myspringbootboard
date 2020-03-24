<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	
	<tr>
		<td>num</td><td>title</td><td>content</td><td>writer</td><td>writeDate</td>
	</tr>
	<c:forEach items="${blist}" var="list">
		<tr>
			<td>${list.num}</td><td>${list.title}</td><td>${list.content}</td><td>${list.writer}</td><td>${list.writeDate}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>