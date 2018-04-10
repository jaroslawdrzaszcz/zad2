<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page.</title>

</head>

<body>
	<h2>My home page, what would you like to do.</h2><br>
    <h4>Choose what you want to do:</h4><br/>
   	<label>If you want to register click:</label><br/>
    	<a href="registration.jsp">Registration</a></br>
	<label>If you are registered member click:</label><br/>
    	<a href="login.jsp">Log in</a></br>	
    <label>If you want be anonymous click:</label><br/>
    	<a href="index.jsp">Be anonymous</a></br>
    <label>If you want go to your profile page click:</label><br/>
    <a href="/userProfile">Profile page</a></br>
     <label>To see all registered users click :</label><br/>
	<a href="/allUsers">All users</a></br>
	<label>If you want go to your premium page click:</label><br/>
	<a href="premium.jsp">Premium</a></br>
	<label>Administration tool to change set/remove Premium status:</label><br/>
	<a href="setPremium.jsp">Set/remove Premium</a>		
</body>
</html>