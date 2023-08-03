<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/12
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
success
<br>
<%--从后端直接拿command对应值，需要引入spring form 标签,如果有path就必须给值--%>
<%--<form:form commandName="command">如果key不是command需要手动指定--%>
<form:form>
    <%--    path与类的属性名对应--%>
    username:<form:input path="username"/>
    <br>
    address:<form:input path="address"/>
    <br>
    <%--    springMVC中没有submit,采用原生submit--%>
    <input type="submit" value="submit">
</form:form>


</body>
</html>
