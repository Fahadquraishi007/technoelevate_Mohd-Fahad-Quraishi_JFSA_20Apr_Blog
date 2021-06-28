<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	Integer id = (Integer) request.getAttribute("empId");
	String name = (String) request.getAttribute("user");
	String pwd = (String) request.getAttribute("password");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Data</title>
</head>
<body>
	<h2><%=id%></h2>
	<h2><%=name%></h2>
	<h2><%=pwd%></h2>
</body>
</html>