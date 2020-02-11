<%@ page import="com.zzy.bean.Sex" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
		<c:forEach items="<%= com.zzy.bean.Sex.values()%>" var="sex">
			<input type="radio" name="sex" value="${sex.name }">${sex.name }<br>
		</c:forEach>
		<input type="submit" value="添加">
	</form>

</body>
</html>