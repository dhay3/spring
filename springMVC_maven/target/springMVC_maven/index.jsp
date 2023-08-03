<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>myMVC</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        #d1 {
            float: left;
            margin-left: 100px;
        }

        #d2 {
            float: right;
            margin-right: 100px;
        }

        #d3 {
            margin: 100px auto auto 200px;
            float: left;
        }
    </style>
</head>
<body>
<%--d1--%>
<div id="d1">
    <h2>Hello World!</h2>
    <a href="mvc/hello">get</a>
    <br>
    无参数的request
    <form action="mvc/hello" method="post">
        <input type="submit" value="post without params"/>
    </form>
    <br>
    有参数的request
    <%--<form action="mvc/hello?username=chz" method="post"> 或--%>
    <form action="mvc/hello" method="post">
        <label>
            username:
            <input type="text" name="username"/>
        </label>
        <br>
        <label>
            age:
            <input type="text" name="age"/>
        </label>
        <br>
        <label>
            height:
            <%--        <input name="height"/>--%>
        </label>
        <input type="submit" value="post with params"/>
    </form>
</div>
<%--d3--%>
<div id="d3">
    PathVariable<br>
    <a href="pv/hello/ccp">pv/hello/{username}</a>
<%--    如果通过表单传值的形式是https://www.baidu.com/?username=csa中间有一个？不匹配--%>
</div>
<%--d2--%>
<div id="d2">
    AnnotationMVC
    <br>
    <a href="chz/header">chz/header</a>
    <br>
    <a href="chz/ttt/ant">
        chz/*/ant
    </a>
    <br>
    <a href="chz/aXc/ant">
        chz/a?c/ant
    </a>
    <br>
    <a href="chz/xyz/abc/anttt">
        chz/**/anttt
    </a>
</div>
</body>
</html>
