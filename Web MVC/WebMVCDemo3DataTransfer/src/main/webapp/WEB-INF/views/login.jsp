<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- We used this taglib to use JSTL -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> Login Here </h3>
	
	<!-- We will be using JSTL to handle the error if wrong 
	credential is provided. (Since, we will be using JSTL so
	we have to add JSTL dependency in pom.xml file) -->
	<c:if test="${ not empty login_Error }">
		<p style="color: red;"><b>${ login_Error }</b></p>
	</c:if>
	
	<form action="login" method="post">
		<input type="email" name="email" placeholder="Enter Email" /><br/><br/>
		<input type="password" name="password" placeholder="Enter Password" /><br/><br/>
		<input type="submit" value="LogIn" />
	</form>
</body>
</html>