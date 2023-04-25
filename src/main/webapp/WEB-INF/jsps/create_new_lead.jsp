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
	<h2>Create New Lead</h2>
	<form action="createLeads" method="post">
		<pre>
		First Name:<input type="text" name="firstName" /> <br>
		Last Name:<input type="text" name="lastName" /> <br>
		Email:<input type="text" name="email" /><br>
		Mobile:<input type="number" name="mobile" /><br>
		 <select name="source">
			<option value="radio">radio</option>
			<option value="new paper">new paper</option>
			<option value="trade show">trade show</option>
			<option value="website">website</option>
		</select><br> <input type="submit" value="submit" />
		</pre>
	</form>
</body>
</html>