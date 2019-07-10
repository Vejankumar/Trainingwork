<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scripting Elements</h1>
<hr>
<h2>
<%!
	int a=10;
	int b=20;
	int i=1;
%>

<%
	int sum = a+b;
	i++;
%>

The value of a is <%= a %><br>
The value of b is <%= b %><br>
The sum of a and b is <%= sum %><br><br>
You visited <%= i %> times
</h2>
</body>
</html>