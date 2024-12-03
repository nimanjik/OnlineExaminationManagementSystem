<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel = "stylesheet" href = "login1.css"/>
</head>
<body>
	<form action= 'LoginServlet' method="post">
	<table>
	    <tr>
	      <td>User Name</td>
	      <td><input type="text" name="id"></td>
	    </tr>
	    
	    <tr>
	       <td>password</td>
	       <td><input type="password" name="pass"></td>
	   </tr>
	</table>
    
    <input type="Submit" name="Submit" value="login">
    </form>
</body>
</html>