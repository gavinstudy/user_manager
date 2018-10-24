<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加学生</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form action="/user/student/insert" method="post">
		  <div class="form-group">
		    <label for="exampleInputEmail1">姓名</label>
		    <input type="text" name="name" class="form-control" id="exampleInputEmail1" placeholder="输入用户名">
		  </div>
		  
		  <div class="form-group">
		    <label for="exampleInputEmail1">年龄</label>
		    <input type="text" name="age" class="form-control" id="exampleInputEmail1" placeholder="输入年龄">
		  </div>
		  
		  <div class="form-group">
		    <label for="exampleInputEmail1">性别</label>
		    <input type="text" name="sex" class="form-control" id="exampleInputEmail1" placeholder="输入性别">
		  </div>
		  
		  <div class="form-group">
		    <label for="exampleInputEmail1">电话</label>
		    <input type="text" name="phone" class="form-control" id="exampleInputEmail1" placeholder="输入电话">
		  </div>

		  <button type="submit" class="btn btn-default">提交</button>
		  <input type="button" id="bt2" class="btn btn-default" value="返回"></button>
		</form>
	</div>
</body>
<script type="text/javascript">
	window.onload = function(){
		var bnt = document.getElementById("bt2");
		bnt.onblur = function(){
			location.href = "/user/student/list";
		}
	}
</script>

</html>