<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Completed</title>
</head>
<body>

	<h3>Billing Details</h3>
	
	Bill No.:${bill.id}<br>
	First Name:${bill.firstName}<br>
	Last Name:${bill.lastName}<br>
	Email:${bill.email}<br>
	Mobile:${bill.mobile}<br>
	Product:${bill.product}<br>
	Amount:${bill.amount}<br>

</body>
</html>