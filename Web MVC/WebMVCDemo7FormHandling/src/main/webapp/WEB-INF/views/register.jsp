<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Register Here </h2>
	<!-- <h3 style="color: red"> Error Message </h3> -->
	
	<form action="register" method="post">
		<input type="text" name="name" placeholder="Enter Name" /><br/><br/>
		<input type="email" name="email" placeholder="Enter Email" /><br/><br/>
		<input type="password" name="password" placeholder="Enter Password" /><br/><br/>
		Gender: <input type="radio" name="gender" value="Male" /> Male <input type="radio" name="gender" value="Female" /> Female<br/><br/>
		
		City: <select name="city">
				<option value="Select City" > Select City </option>
				<option value="Delhi" > Delhi </option>
				<option value="Kolkata" > Kolkata </option>
				<option value="Pune" > Pune </option>
			  </select><br/><br/>
		<input type="submit" value="Register" />
	</form>
</body>
</html>