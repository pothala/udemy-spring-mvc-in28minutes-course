<%--
  list-todos.jsp
  User: nrojiani
  Date: 6/9/17
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>To-Dos for ${name}</title>
</head>
<body>
<h1>Hi ${name}!</h1>
<div>
    <table>
        <caption>Your To-Dos Are:</caption>
        <thead>
            <tr>
                <th>Description</th>
                <th>Date</th>
                <th>Completed</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.description}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

<a class="button" href="/add-todo">Add New To-Do</a>
</body>
</html>