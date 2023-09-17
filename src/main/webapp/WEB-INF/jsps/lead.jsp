<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Page</title>
</head>
<body>
<h3>Lead Page | Lead</h3>
<hr>
<form action="saveLead" method="post">
<pre>
First Name  : <input type = "text" name = "firstName" />
Last  Name  : <input type = "text" name = "lastName" />
Lead Source : <select name="leadSource" >
              <option value="radio">Radio</option>
              <option value="t.v">T.V</option>
              <option value="news paper">News Paper</option>
              <option value="youtube ads">YouTube ADS</option>
              </select>
Email       : <input type = "email" name = "email" />
City        : <input type = "text" name = "city" />
Mobile      : <input type = "text" name = "mobile" />
<input type = "submit" value="save">
</pre>
</form>
</body>
</html>