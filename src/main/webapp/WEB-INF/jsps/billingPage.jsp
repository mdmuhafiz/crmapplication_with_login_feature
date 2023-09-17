<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Page</title>
</head>
<body>
<h3>Billing Page | Billing</h3>
<hr>
<form action="saveBill" method="post">
<pre>
Id          : <input type = "text" name = "id" value="${contact.id}" readonly/>
First Name  : <input type = "text" name = "firstName" value="${contact.firstName}" readonly/>
Last Name   : <input type = "text" name = "lastName" value="${contact.lastName}" readonly/>
Email       : <input type = "email" name = "email" value="${contact.email}" readonly/>
City        : <input type = "text" name = "city" value="${contact.city}" readonly/>
Mobile      : <input type = "text" name = "mobile" value="${contact.mobile}" readonly/>
Product     : <input type = "text" name = "product" />
Amount      : <input type = "text" name = "amount" />
Mode        : Cash   <input type="radio" name="mode" value="cash">
              Online <input type="radio" name="mode" value="online">
<input type = "submit" value="Generate Bill">
</pre>
</form>
</body>
</html>