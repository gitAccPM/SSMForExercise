<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加页面</title>
</head>
<body>
	<form:form action="${pageContext.request.contextPath}/emp" method="post" modelAttribute="employee">
		<c:if test="${!empty employee.name }" var="flag">
			<form:hidden path="id"/>
			<input type="hidden" name="_method" value="PUT"/>
		</c:if>
		员工姓名:<form:input path="name"/>
		<br/>
		员工性别:<form:radiobuttons path="gender" items="${genders }"/>
		<br/>
		员工邮箱:<form:input path="email"/>
		<br/>
		员工部门:<form:select path="departmentId" items="${depts }" itemLabel="departmentName" itemValue="departmentId"></form:select>
		<br/>
		<c:if test="${flag }">
			<input type="submit" value="修改"/>
		</c:if>
		<c:if test="${!flag}">
			<input type="submit" value="添加"/>
		</c:if>
	</form:form>
</body>
</html>