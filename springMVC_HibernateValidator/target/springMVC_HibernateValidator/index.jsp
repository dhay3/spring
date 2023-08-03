<html>
<body>
<h2>Hello World!</h2>
<a href="hello">click</a>
<form action="hello">
    name:<input type="text" name="name">
    <br>
<%--    前端的type="date"对应后端的Date,且需要配对的@DateFormat--%>
    date:<input type="date" name="birthday">
    <br>
    age:<input type="text" name="age">
    <br>
<%--    前端的type="email"会自动校验--%>
<%--    email: <input type="email" name="email">--%>
    email: <input type="text" name="email">
    <br>
    <input type="submit" value="submit">
</form>
</body>
</html>
