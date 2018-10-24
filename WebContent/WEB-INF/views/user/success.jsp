<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
</head>
<body>
	<table class="table table-striped table-bordered">
		<thead>
			<th>姓名</th>
			<th colspan="3">操作</th>

		</thead>
		<c:forEach var="list" items="${list}">
			<tr>
				<td>${list.name}</td>
				<td><a href="/user/student/update?id=${list.id}">修改</a></td>
				<td><a href="/user/student/delete?id=${list.id}">删除</a></td>
				<td><a href="/user/student/xiangxi?id=${list.id}">详情</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4"><a href="/user/student/insert">增加用户</a></td>
		</tr>
	</table>
</body>
</html>