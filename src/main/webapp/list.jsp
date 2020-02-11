<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>编号</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${list}" var="g">
			<tr>
				<td>${g.id }</td>
				<td>${g.sex.name }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>