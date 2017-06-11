<%--
  list-todos.jsp
  User: nrojiani
  Date: 6/9/17
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>To-Dos for ${name}</title>
</head>
<body>
<h1>Hi ${name}! Here are your To-Dos:</h1>
${todos} <br/>

<a class="button" href="/add-todo">Add New To-Do</a>
</body>
</html>