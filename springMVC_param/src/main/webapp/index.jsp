<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<body>
<h2>Hello World!</h2>
<a href="restful/restful/234">restful</a>

<%--<form action="form" method="get" id="f1">--%>
<%--<form action="requestHeader" method="get" id="f1">--%>
<form action="cookie" method="get" id="f1">
    <input type="hidden" name="_method" value="PUT">
    <input type="text" name="username">
<%--    <input type="text" name="age">--%>
    <input type="submit" value="form"/>
</form>

<%--<form action="object" id="f2">--%>
<%--<form action="servlet" id="f2">--%>
<%--<form action="modelAndView" id="f2">--%>
<%--<form action="modelMap" id="f2">--%>
<%--<form action="model" id="f2">--%>
<%--<form action="map" id="f2">--%>
<form action="returnObj" id="f2">
    id:<input type="text" name="id"/>
    <br>
    username:<input type="text" name="username"/>
    <br>
<%--    级联属性--%>
    homeAddress:<input type="text" name="address.homeAddress"/>
    <br>
   schoolAddress<input type="text" name="address.schoolAddress"/>
    <br>
    <input type="submit" value="object">
</form>

</body>
<style>
    #f2{
        float: right;
    }
</style>
</html>
