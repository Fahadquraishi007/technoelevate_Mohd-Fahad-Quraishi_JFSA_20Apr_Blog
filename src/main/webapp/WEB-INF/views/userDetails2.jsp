<%@page import="com.te.springmvc.beans.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	UserDetails userDetails = (UserDetails) request.getAttribute("user");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User - DTO</title>
</head>
<body>
	<%=userDetails.getEmpId()%>
	<%=userDetails.getUser()%>
	<%=userDetails.getPassword()%>
	
	<a href="./login"> <button> Logout </button> </a>
</body>
</html>