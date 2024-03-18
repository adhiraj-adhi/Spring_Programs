<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<tiles:insertAttribute name="header1" />
	
	<tiles:insertAttribute name="menubar1" />
	
	<tiles:insertAttribute name="body1" />
	
	<tiles:insertAttribute name="footer1" />
	
</body>
</html>