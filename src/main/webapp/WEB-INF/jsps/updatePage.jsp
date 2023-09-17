<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead Page</title>
</head>
<body>
<h3>Update Page | update</h3>
<hr>
<form action="updateLeads" method="post">
<pre>
Id          : <input type = "text" name = "id" value="${lead.id}" readonly>
First Name  : <input type = "text" name = "firstName" value="${lead.firstName}" />
Last Name   : <input type = "text" name = "lastName" value="${lead.lastName}" />
Lead Source : <select name="leadSource" value="${lead.leadSource}">
              <option value="radio">Radio</option>
              <option value="news paper">News Paper</option>
              <option value="youtube">YouTube</option>
              <option value="t.v">T.V</option>
              </select>
Email       : <input type = "email" name = "email" value="${lead.email}" />
City        : <input type = "text" name = "city" value="${lead.city}" />
Mobile      : <input type = "text" name = "mobile" value="${lead.mobile}" />
<input type = "submit" value="update">
</pre>
</form>
</body>
</html>