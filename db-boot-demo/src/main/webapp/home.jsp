<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Spring Data JPA Demo</h1>
<form action="addStudent">
	<h2>
		Roll No. <input type="text" name="rollno"><br>
		Name <input type="text" name="name"><br>
		School <input type="text" name="school"><br>
		
		<input type="submit" name="submit" value="ADD Student">
		<input type="reset" name="reset" value="Reset">
	</h2>
</form>
</body>
</html>