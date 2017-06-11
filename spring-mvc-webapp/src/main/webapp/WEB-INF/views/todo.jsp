<%--
  todo.jsp: View for creating & editing To-Dos

  User: nrojiani
  Date: 6/10/17
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>To-Do</title>
</head>
<body>
<h1>Add a To-Do</h1>
<form action="/add-todo" method="post">
    <input name="description"/> <input type="submit" value="Add"/>
</form>
</body>
</html>
