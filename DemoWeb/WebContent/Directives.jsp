<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@page import="java.util.Date" %>
<%@page isErrorPage="true" %>
<%@page info="Just for demo" %>
<%@page session="true" %>

<body>
<h1> Directive Demo</h1>
<hr>
	<h2>
	Today date : <%= new Date() %><br>
	Exceptionj : <%= exception %><br>
	information :<%= getServletInfo() %><br>
	session id : <%= session.getId() %><br>
	<%@include file="login.html" %>
	<%@include file="Demo.jsp" %>
	<%@include file="Abc.jsp" %>
	</h2>
</body>
</html>