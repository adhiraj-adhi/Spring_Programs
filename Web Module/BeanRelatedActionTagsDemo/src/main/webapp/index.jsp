<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean class="com.adhiraj.beans.Student" id="std1" />

<jsp:setProperty property="name" name="std1" value="Adhiraj" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty property="roll" name="std1" value="102" />
	
	Name: <jsp:getProperty property="name" name="std1" /><br/>
	Roll: <jsp:getProperty property="roll" name="std1" />
</body>
</html>