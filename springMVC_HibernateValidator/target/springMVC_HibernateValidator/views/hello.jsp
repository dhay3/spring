<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/10
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${requestScope.errors}" var="item">
    ${item.getDefaultMessage()} <br>
</c:forEach>
<br>
hello world!
</body>
</html>
