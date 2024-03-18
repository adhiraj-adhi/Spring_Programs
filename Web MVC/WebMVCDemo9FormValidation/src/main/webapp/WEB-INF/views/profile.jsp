<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> Welcome: ${ studentModel.getName() } </h3>
	<h4> Email: ${ studentModel.getEmail() } </h4>
	<h4> Gender: ${ studentModel.getGender() } </h4>
	<h4> City: ${ studentModel.getCity() } </h4>
</body>
</html>