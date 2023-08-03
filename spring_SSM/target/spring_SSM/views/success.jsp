<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/11
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>success</title>
</head>
<body>
Welcome, ${requestScope.get("user").username}!
<br>
success
</body>
</html>
