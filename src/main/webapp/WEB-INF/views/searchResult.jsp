<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
	String id = (String) request.getAttribute("id");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Path - /Search Method - GET</h1>

	<h2>
		Entered Id -
		<%
		if (id != null) {
	    %>
		<%=id%>
		<%
			}
		%>
		</h2>
</body>
</html>