<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hello World!</h2>
springMVC form <br>
<a href="hello">click</a>
<br>
springMVC checkbox <br>
<a href="checkbox">checkbox</a>
<br>
springMVC表单标签支持delete和put，但是还是要配置hiddenHttpMethodFilter
<form:form action="test" method="post">
    <input type="submit" value="post">
</form:form>
<br>
<br>
<form:form action="test" method="get">
    <input type="submit" value="get">
</form:form>
<br>
<br>
<form:form action="test" method="delete">
    <input type="submit" value="delete">
</form:form>
<br>
<br>
<form:form action="test" method="put">
    <input type="submit" value="put">
</form:form>
</body>
</html>
