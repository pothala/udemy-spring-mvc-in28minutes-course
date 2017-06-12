<%--
  welcome.jsp
  User: nrojiani
  Date: 6/9/17
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Spring MVC To-Do App</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
Welcome ${name}.<br/>
<div>
    <a href="/list-todos">Click here</a> to start maintaining your To-Dos.
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>