<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration form</title>
</head>
<body>
    <form action= "registration" method="post">
    
    	<h2>New user registration.</h2><br>
        <label>User name:<input type = "text" id = "username" name = "username"/></label><br/>
        <label>Password:<input type = "text" id = "password" name = "password"/></label><br/>
        <label>Confirm Password:<input type = "text" id = password2 name = "password2"/></label><br/>
        <label>Email:<input type = "text" id = "email" name = "email"/></label><br/>   

        <INPUT TYPE = "submit" value = "Register"><br/>
        <br/>
        <label>If you want go back to home page click:</label><br/>
    	<a href="index.jsp">Home page</a></br>
    </form>
</body>
</html>