<%--
  login.jsp
  User: nrojiani
  Date: 6/9/17
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Spring MVC App</title>
</head>
<body>
<p><span style="color: red; ">${errorMessage}</span></p>
<form action="/login" method="POST">
    Name : <input name="name"/> Password : <input name="password" type="password" /> <input type="submit" />
</form>
</body>
</html>