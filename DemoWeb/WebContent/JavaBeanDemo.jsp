<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Java Bean demo</h1>
<hr>
<h2>
<jsp:useBean id="p1" class="com.Person"></jsp:useBean>
<jsp:setProperty property="name" name="p1" value = "Ramesh"/>
<jsp:setProperty property="age" name="p1" value = "25"/>
Your good name is : <jsp:getProperty property="name" name="p1"/><br>
Your age is : <jsp:getProperty property="age" name="p1"/><br>
<hr>
<%
	com.Person p2 = new com.Person();
	p2.setName("Vejan");
	p2.setAge(21);
	out.println("Name is : "+p2.getName());
	out.println("Age is : "+p2.getAge());
%>
</h2>
</body>
</html>