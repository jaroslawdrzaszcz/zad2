<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Set/remove premium status.</title>
</head>
<body>
<h3>Administrator tool:</h3>
	<form action="premium" method="get">
		<label>User name:<input type="text" id="username" name="username"/></label><br />
		<label>Set premium status<input type="radio" name="premium" value="set"><br></label>
		<label>Remove premium status<input type="radio" name="premium" value="remove"><br></label>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>