<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "y_insert" method = "post">
		Name : <input type = 'text' name = 'name'> <br>
		email : <input type = 'email' name = 'email'><br>
		Student ID : <input type = 'text' name = 'id'><br>
		Contact Number : <input type = 'text' name = 'contact'><br>
		Subject : <input type = 'text' name = 'subject'> <br>
		Description: 
		
		  <textarea name="description" rows="4" cols="50"></textarea>
		
		<input type = 'submit' name = 'submit' value = 'Submit'>    
	</form>
</body>
</html>