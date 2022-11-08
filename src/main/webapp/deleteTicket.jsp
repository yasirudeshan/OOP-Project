<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String tid = request.getParameter("tid");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String id = request.getParameter("id");
		String contact = request.getParameter("contact");
		String subject = request.getParameter("subject");
		String description = request.getParameter("description");
				
		%>
		
		<form action = "y_delete" method = "post">
		Ticket ID: <input type = 'text' name = 'tid' value= '<%= tid%>' readonly> <br>
		Name : <input type = 'text' name = 'name' value= '<%= name%>' readonly> <br>
		email : <input type = 'email' name = 'email' value='<%= email%>' readonly><br>
		Student ID : <input type = 'text' name = 'id' value='<%= id%>' readonly><br>
		Contact Number : <input type = 'text' name = 'contact' value='<%= contact%>' readonly><br>
		Subject : <input type = 'text' name = 'subject' value='<%= subject%>' readonly> <br>
		Description: 
		
		 <textarea name="description" rows="4" cols="50" readonly><%= description%></textarea>
		
		<input type = 'submit' name = 'submit' value = 'Delete'> 
		
	</form>
</body>
</html>