<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/10
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${requestScope.get('errors')!=null}">
    <c:forEach items="${requestScope.get('errors')}" var="error">
        ${error.getDefaultMessage()} <br>
    </c:forEach>
</c:if>
welcome
</body>
</html>
