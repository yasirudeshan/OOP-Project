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
	
	<c:forEach var = "cus" items = "${cusDetails}">
	
	${cus.id}
	${cus.name}
	${cus.email}
	${cus.phone}
	${cus.username}
	${password}
		
	</c:forEach>

</body>
</html>