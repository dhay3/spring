<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/12
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form>
<%--    根据set方法注入来实现的，value值就是list中的值--%>
    football:<form:checkbox path="list" value="football"/>
    basketball:<form:checkbox path="list" value="basketball"/>
    bigBall<form:checkbox path="list" value="bigBall"/>

    us:<form:radiobutton path="country" value="us"/>
    uk:<form:radiobutton path="country" value="uk"/>
</form:form>
</body>
</html>
