<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/8
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello world springMVC!
<%--通过request域拿到属性值--%>
request:===${requestScope.get("student")}
request:===${requestScope.get("stu")}
<br>
session:===${sessionScope.student.username}
</body>
</html>
