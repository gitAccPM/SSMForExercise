<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工信息界面</title>
	<script type="text/javascript" src="scripts/jquery-1.7.2.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$("._del").click(function(){
				var flag = window.confirm("确定删除该员工？");
				if(!flag){
					return false;
				}
				var href = $(this).attr("href");
				$("form").attr("action",href).submit();
				return false;
			});
		});
	</script>
</head>
<body>
	<form action="" method="post">
		<input type="hidden" name="_method" value="DELETE"/>
	</form>
	<h1 align="center">员工信息列表</h1>
	<table align="center" bgcolor="yellow" border="1px" width="70%" cellspacing="0px">
		<tr>
			<th>Id</th>
			<th>姓名</th>
			<th>性别</th>
			<th>邮箱</th>
			<th>部门</th>
			<th>Operator</th>
		</tr>
		<c:forEach items="${emps }" var="emp">
			<tr>
				<td align="center">${emp.id }</td>
				<td align="center">${emp.name }</td>
				<td align="center">${emp.gender }</td>
				<td align="center">${emp.email }</td>
				<td align="center">${emp. department.departmentName}</td>
				<td align="center">
					<a href="emp/${emp.id }">EDIT</a>
					&nbsp;&nbsp;
					<a class="_del" href="emp/${emp.id }">DELETE</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<h2 align="center"><a href="emp">ADD NEW EMPLOYEE</a></h2>
</body>
</html>