<%--
  Created by IntelliJ IDEA.
  User: 82341
  Date: 2020/3/7
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--sql insert对应RequestMapping.POST--%>
<form action="testRest/12" method="post">
    <%--    <input type="hidden" name="_method">--%>
    <input type="submit" value="增加">
</form>
<%--sql delete对应RequestMapping.DELETE--%>
<form action="testRest/13" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="删除">
</form>
<%--sql update对应RequestMapping.PUT--%>
<form action="testRest/14" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="更新">
</form>
<%--sql select对应RequestMapping.GET--%>
<form action="testRest/15" method="get">
    <%--    <input type="hidden" name="_method">--%>
    <input type="submit" value="查">
</form>
</body>
</html>
