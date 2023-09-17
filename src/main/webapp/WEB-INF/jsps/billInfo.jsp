<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Information</title>
</head>
<body>
<h3>Bill Information | Bill Info</h3>
<hr>
<pre>
Id:${bill.id}
First Name:${bill.firstName}
Last Name:${bill.lastName}
Email:${bill.email}
City:${bill.city}
Mobile:${bill.mobile}
Product:${bill.product}
Amount:${bill.mobile}
Mode:${bill.mode}
</pre>
<form action="sendEmail" method="post">
<pre>
<input type = "hidden" name = "email" value="${bill.email}">
<input type = "submit" value="send email">
</pre>
</form>
</body>
</html>