<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	
	<h1>User Account Delete</h1>
	
	<form action="DeleteUserServlet" method="post">
		<table border="1">
		
			<tr>
				<label>User ID</label>
				<input type="text" name="userid" value="<%= id%>" readonly/><br>
				
			</tr>
			<tr>
				<label>Name</label>
				<input type="text" name="name" value="<%= name%>" readonly><br>				
			</tr>
			<tr>
				<label>Email</label>
				<input type="text" name="email" value="<%= email%>" readonly><br>
				
			</tr>
			<tr>
				<label>Phone Number</label>
				<input type="text" name="phone" value="<%= phone%>" readonly><br>
				
			</tr>


				
		</table>
		<input type="submit" name="submit" value="Delete My Account"><br>
		
		
	</form>
	

</body>
</html>