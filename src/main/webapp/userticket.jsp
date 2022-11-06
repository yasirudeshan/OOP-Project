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
	<table border = '1'>
	<c:forEach var = "get" items = "${getTicket}">
	
	<c:set var ='name' value = '${get.name}'/>
	<c:set var ='email' value = '${get.email}'/>
	<c:set var ='id' value = '${get.id}'/>
	<c:set var ='contact' value = '${get.contact}'/>
	<c:set var ='subject' value = '${get.subject}'/>
	<c:set var ='description' value = '${get.description}'/>

	<tr>
	
	<td>${get.name}</td>
	<td>${get.email}</td>
	<td>${get.id}</td>
	<td>${get.contact}</td>
	<td>${get.subject}</td>
	<td>${get.description}</td>
	<td><a href='${updateticket}'><input type='button' name = 'edit' value ='Edit'></a></td>
	<td><a href=''><input type='button' name = 'delete' value ='Delete'></a></td>
	</tr>
	</c:forEach>
	
	</table>
	
	<c:url value = 'updateticket.jsp' var = 'updateticket'>
		<c:param name = 'name' value = '${name}'/>
		<c:param name = 'email' value = '${email}'/>
		<c:param name = 'id' value = '${id}'/>
		<c:param name = 'contact' value = '${contact}'/>
		<c:param name = 'subject' value = '${subject}'/>
		<c:param name = 'description' value = '${description}'/>
	</c:url>
</body>
</html>