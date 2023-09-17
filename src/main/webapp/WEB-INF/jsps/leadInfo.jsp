<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info Page</title>
</head>
<body>
<h3>Lead Info Page | Lead</h3>
<hr>
<pre>
Id:${lead.id}
First Name:${lead.firstName}
Last Name:${lead.lastName}
Lead Source:${lead.leadSource}
Email:${lead.email}
City:${lead.city}
Mobile:${lead.mobile}
</pre>
<form action="sendEmail" method="post">
<pre>
<input type = "hidden" name = "email" value="${lead.email}">
<input type = "submit" value="send email">
</pre>
</form>
<form action="convertToContact" method="post">
<pre>
<input type = "hidden" name = "id" value = "${lead.id}" />
<input type = "submit" value="convert">
</pre>
</form>
</body>
</html>