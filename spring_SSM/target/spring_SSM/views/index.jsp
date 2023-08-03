<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/11
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<form action="query" method="post" enctype="multipart/form-data">
    name: <input type="text" name="username">
    <br>
    password: <input type="text" name="password">
    <br>
    file: <input type="file" name="file">
    <br>
    <input type="submit" value="submit">
</form>
</body>
</html>
