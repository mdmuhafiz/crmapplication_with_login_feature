<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Result</title>
</head>
<body>
<h3>Lead Result | Result</h3>
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
<th>Delete</th>
<th>Update</th>
</tr>
<c:forEach var = "lead" items="${lead}">
<tr>
<td>${lead.id}</td>
<td><a href = "getLeadById?id=${lead.id}">${lead.firstName}</td>
<td>${lead.lastName}</td>
<td>${lead.leadSource}</td>
<td>${lead.email}</td>
<td>${lead.city}</td>
<td>${lead.mobile}</td>
<td><a href = "delete?id=${lead.id}">delete</td>
<td><a href = "updateLeadById?id=${lead.id}">Edit</td>

</tr>
</c:forEach>
</table>
</body>
</html>