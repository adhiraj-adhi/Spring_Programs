<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %> <!-- So that Expression Language isn't ignored in page -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4> Hello ${ user_name } </h4>
	<h5> Age: ${ user_age } </h5>
	<h5> City: ${ user_city } </h5>
</body>
</html>