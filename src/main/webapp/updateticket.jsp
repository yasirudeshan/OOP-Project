<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		
		<form action = "update" method = "post">
		Ticket ID: <input type = 'text' name = 'tid' value= '<%= tid%>' readonly> <br>
		Name : <input type = 'text' name = 'name' value= '<%= name%>'> <br>
		email : <input type = 'email' name = 'email' value='<%= email%>'><br>
		Student ID : <input type = 'text' name = 'id' value='<%= id%>'><br>
		Contact Number : <input type = 'text' name = 'contact' value='<%= contact%>'><br>
		Subject : <input type = 'text' name = 'subject' value='<%= subject%>'> <br>
		Description: 
		
		 <textarea name="description" rows="4" cols="50"><%= description%></textarea>
		
		<input type = 'submit' name = 'submit' value = 'Update'>    
	</form>
</body>
</html>

