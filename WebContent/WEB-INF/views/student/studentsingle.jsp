<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		 <p>
			<h4>姓名:</h4>
			${student.name}
		 </p>
		<p>
		  <h4>年龄:</h4>
		  ${student.age}
		</p>
		<p>
		  <h4>性别:</h4>
		  ${student.sex}
		</p>
		<p>
		  <h4>电话:</h4>
		  ${student.phone}
		</p>
	</div>
	<input type="button" id="bt" value="返回">
</body>
<script type="text/javascript">
	window.onload=function(){
		var bnt = document.getElementById("bt");
		bnt.onblur=function(){
			location.href="/user/student/list";
		}
	}
</script>
</html>