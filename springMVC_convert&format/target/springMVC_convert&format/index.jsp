<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form action="convert">
    sInfo: <input type="text" name="sInfo">
    <br>

    <input type="submit" value="submit">
</form>
---------
<form action="format">
<%--    name中不能是date(和type中的date重合)--%>
    date:<input type="text" name="bir">
    <br>
    num: <input type="text" name="num">
    <br>
    <input type="submit" value="submit">
</form>
</body>
</html>
