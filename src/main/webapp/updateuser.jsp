<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String userName = request.getParameter("uname");
		String password = request.getParameter("pass");
	%>


	

	<form action="UpdateUserServlet" method="post">
		<table border="1">
		
			<tr>
				<label>User ID</label>
				<input type="text" name="userid" value="<%= id%>" readonly/><br>
				
			</tr>
			<tr>
				<label>Name</label>
				<input type="text" name="name" value="<%= name%>"><br>				
			</tr>
			<tr>
				<label>Email</label>
				<input type="text" name="email" value="<%= email%>"><br>
				
			</tr>
			<tr>
				<label>Phone Number</label>
				<input type="text" name="phone" value="<%= phone%>"><br>
				
			</tr>
			<label>User name</label>
			<input type="text" name="uname" value="<%= userName%>"><br>
			
			</tr>
			<tr>
				<label>Password</label>
				<input type="text" name="password" value="<%= password%>"><br>
				
			</tr>

				
		</table>
		<input type="submit" name="submit" value="Update My Details"><br>
		
		
	</form>

</body>
</html>