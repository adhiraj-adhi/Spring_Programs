<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- We know that to use any other external tags we have to use taglib so
	 To use Spring Form Tag Library we have to use taglib as 
-->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Register Here </h2>
	
	<!-- Creating form using Spring Form Tag Library -->
	<form:form action="register" method="post" modelAttribute="studentModel">
		Name: <form:input path="name" /> 
		<form:errors path="name" cssStyle="color: red;" cssClass="errorMessage" />
		<br/><br/>
		Email: <form:input path="email"/> <br/><br/>
		Password: <form:password path="password" /><br/><br/>
		Gender: <form:radiobutton path="gender" label="Male" value="Male" />
				<form:radiobutton path="gender" label="Female" value="Female" /><br/><br/>
		City: <form:select path="city">
				<form:option value="Select Citry"> Select City </form:option>
				<form:option value="Delhi"> Delhi </form:option>
				<form:option value="Kolkata"> Kolkata </form:option>
				<form:option value="Pune" label="Pune" />
			  </form:select><br/><br/>
		
		<!-- NOTE: In path attribute we provide the exact name of private 
		variables of Student bean class to which we want to bind data using Spring 
		Form Tag Library -->
		
		<input type="submit" value="Register" />
	</form:form>
</body>
</html>