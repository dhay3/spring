<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/9
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%--国际化实现不适用标签库uri--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
<%--根据properties中的key--%>
<fmt:message key="resource.hello"/>,
<fmt:message key="resource.world"/>
</body>
</html>
