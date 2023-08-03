<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/10
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:if test='${requestScope.get("errors")!=null}'>
        <%--    遍历后端传过来的错误--%>
        <c:forEach items='${requestScope.get("errors")}' var="error">
            ${error.getDefaultMessage()}
        </c:forEach>
    </c:if>
    <title>Title</title>
</head>
<body>
success
</body>
</html>
