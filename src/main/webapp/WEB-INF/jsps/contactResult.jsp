<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Result</title>
</head>
<body>
<h3>Contact Result | Result</h3>
<hr>
<table border="1">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Lead Source</th>
<th>Email</th>
<th>City</th>
<th>Mobile</th>
<th>Billing</th>

</tr>
<c:forEach var = "contact" items="${contact}">
<tr>
<td>${contact.id}</td>
<td><a href = "getContactById?id=${contact.id}">${contact.firstName}</td>
<td>${contact.lastName}</td>
<td>${contact.leadSource}</td>
<td>${contact.email}</td>
<td>${contact.city}</td>
<td>${contact.mobile}</td>
<td><a href = "getBillingByid?id=${contact.id}">Select</td>

</tr>
</c:forEach>
</table>
</body>
</html>