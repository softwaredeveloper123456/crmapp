<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ include file="menu.jsp" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Contacts</title>
</head>
<body>
	
	<h3>List All Contacts</h3>

	<table border="2">
	<tr>
	<td>First Name</td>
	<td>Last Name</td>
	<td>Email</td>
	<td>Mobile</td>
	<td>Source</td>
	<td>Billing</td>
	</tr>
	
	<c:forEach var="lists" items="${leads}">
	<tr>
	<td>${lists.firstName}</td>
	<td>${lists.lastName}</td> 
	<td>${lists.email}</td>
	<td>${lists.mobile}</td>
	<td>${lists.source}</td>
	<td><a href="generateBill?id=${lists.id}">billing</a></td>
	</tr>
	
	</c:forEach>
	
	</table>	

</body>
</html>