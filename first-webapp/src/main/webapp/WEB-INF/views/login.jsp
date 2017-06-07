<%--
  Created by IntelliJ IDEA.
  User: nrojiani
  Date: 5/9/17
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Navid's Web App</title>
</head>
<%
    /* Scriptlet (note: not recommended!) */
    System.out.println(request.getParameter("name"));
    Date date = new Date();
%>
<div>Current date is <%=date%></div> <!-- Scriptlet expression -->
<body>
    <p>Hello ${name}, from JSP!</p>
</body>
</html>
