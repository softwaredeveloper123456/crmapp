<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Lead</title>
</head>
<body>
	<h2>Create Bill</h2>
	<form action="saveBill" method="post">
		<pre>
		First Name:<input type="text" name="firstName" value="${contact.firstName}"/> <br>
		Last Name:<input type="text" name="lastName" value="${contact.lastName}"/> <br>
		Email:<input type="text" name="email" value="${contact.email}" /><br>
		Mobile:<input type="number" name="mobile" value="${contact.mobile}" /><br>
		Product:<input type="text" name="product"/>
		Amount:<input type="text" name="amount"/>
		<input type="submit" value="generateBill"/>
		</pre>
	</form>
</body>
</html>