<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>



<html>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
 .form-control{
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

.form-control:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}

.errormsg{
		color : red;
	}
</style>
<body>

<form:form action="register" method = "POST" modelAttribute="employee">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
	<small><form:errors path="name" cssClass="errormsg" /></small><br>
    <form:label path="name">Name:</form:label><form:input path="name" size="30" cssClass="form-control" placeholder="Enter name" />
            
        
        <div class="form-group">
         <small><form:errors path="age" cssClass="errormsg" /></small><br>
            <form:label path="age">Age:</form:label><form:input path="age" cssClass="form-control" placeholder="Enter age" />
           
        </div>
        <div class="form-group">
         <small><form:errors path="salary" cssClass="errormsg" /></small><br>
            <form:label path="salary">Salary:</form:label><form:input path="salary" cssClass="form-control" placeholder="Enter Salary" />
           
        </div>
         <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
        <div class="form-group">
            <button type="submit" >Signup</button>
        </div>
  </div>
</form:form>

</body>
</html>
