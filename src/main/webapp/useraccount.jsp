<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <table>
     <c:forEach var="user" items="${studentDetails}">
     
     <c:set var="id" value="${user.getId()}"/>
     <c:set var="name" value="${user.getName()}"/>
     <c:set var="email" value="${user.getEmail()}"/>
     <c:set var="phone" value="${user.getPhone()}"/>
     <c:set var="userName" value="${user.getUsername()}"/>
     <c:set var="password" value="${user.getPassword()}"/>
     
     <tr>
         <td>User ID</td>
         <td>${user.getId()}</td>
     </tr>
     <tr>
         <td>User Name</td>
         <td>${user.getName()}</td>
     </tr>
     <tr>
         <td>User Email</td>
         <td>${user.getEmail()}</td>
     </tr>
     <tr>
         <td>User Phone</td>
         <td>${user.getPhone()}</td>
     </tr>
     <tr>
         <td>User User Name</td>
         <td>${user.getUsername()}</td>
     </tr>

     
     </c:forEach>
     </table>
     
     <c:url value="updateuser.jsp" var="userUpdate">
         <c:param name="id" value="${id}"/>
         <c:param name="name" value="${name}"/>
         <c:param name="email" value="${email}"/>
         <c:param name="phone" value="${phone}"/>
         <c:param name="uname" value="${userName}"/>
         <c:param name="pass" value="${password}"/>
     </c:url>
     <a href="${userUpdate}">
         <input type="button" name="update" value="Update My Data">
     </a>
     
     <br>
     <c:url value="deleteuser.jsp" var="userdelete">
          <c:param name="id" value ="${id}" />
          <c:param name="name" value ="${name}" />
          <c:param name="email" value ="${email}" />
          <c:param name="phone" value="${phone}" />
          <c:param name="uname" value ="${username}" />
          <c:param name="pass" value ="${password}" />
     </c:url>
     
     <a href="${userdelete}">
     <input type="button" name="delete" value="Delete MyAccount">
     </a>
     
</body>
</html>