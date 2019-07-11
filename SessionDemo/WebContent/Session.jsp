<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.util.Date" %>
<h1>Session Demo</h1>
<hr>
<h3>
	Session Id : <%= session.getId() %><br>
	Created at : <%= new Date(session.getCreationTime()) %><br>
	Cuurent time : <%= new Date() %><br>
	Last Accessed : <%= new Date(session.getLastAccessedTime()) %><br>
	Is new : <%= session.isNew() %>
	<% 
		//session.invalidate();
		session.setMaxInactiveInterval(10);
	%>
</body>
</html>