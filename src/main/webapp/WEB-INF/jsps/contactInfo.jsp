<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Info Page</title>
</head>
<body>
<h3>Contact Info Page | Contact</h3>
<hr>
<pre>
Id:${contact.id}
First Name:${contact.firstName}
Last Name:${contact.lastName}
Lead Source:${contact.leadSource}
Email:${contact.email}
City:${contact.city}
Mobile:${contact.mobile}
</pre>
<form action="sendEmail" method="post">
<pre>
<input type = "hidden" name = "email" value="${contact.email}">
<input type = "submit" value="send email">
</pre>
</form>
</body>
</html>