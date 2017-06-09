<html>
<head>
    <title>Spring MVC App</title>
</head>
<body>
<p><span style="color: red; ">${errorMessage}</span></p>
<form action="/spring-mvc/login" method="POST">
    Name : <input name="name" type="text" /> Password : <input name="password" type="password" /> <input type="submit" />
</form>
</body>
</html>