<%--
  todo.jsp: View for creating & editing To-Dos

  User: nrojiani
  Date: 6/10/17
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>To-Do</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1>Add a To-Do</h1>
<form action="/add-todo" method="post">
    <input name="description"/> <input type="submit" value="Add"/>
</form>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
