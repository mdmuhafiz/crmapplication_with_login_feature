<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Result</title>
</head>
<body>
<h3>Billing Result | Result</h3>
<hr>
<table border="1">
<tr>
<th>Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>City</th>
<th>Mobile</th>
<th>Product</th>
<th>Amount</th>
<th>Mode</th>
</tr>
<c:forEach var = "bill" items="${bill}">
<tr>
<td>${bill.id}</td>
<td><a href = "getBillByLeadsId?id=${bill.id}">${bill.firstName}</td>
<td>${bill.lastName}</td>
<td>${bill.email}</td>
<td>${bill.city}</td>
<td>${bill.mobile}</td>
<td>${bill.product}</td>
<td>${bill.amount}</td>
<td>${bill.mode}</td>
</tr>
</c:forEach>
</table>
</body>
</html>