<html>
<head>
    <title>index</title>
    <%--    前端中的/都表示协议加端口--%>
    <%--    ${pageContext.request.contextPath}表示/+当前项目名称(相对目录下后面必需加/)--%>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
    <script>
        $(function () {

        });

        function check() {
            let username = $("#username").val();
            let password = $("#password").val();
            $.ajax({
                type: "post",
                url: "login",
                // data: "username=" + username + "&password=" + password,
                //前端可以通过Json形式传值,但是接受后端的参数时必需是Json形式的
                data: {"username": username , "password": password},
                success: function (result) {
                    //each取到的value是原生的js DOM对象
                    // $("span").each(function () {
                    //     alert(1)
                    // });
                    // 两种方式都可以拿到值
                    console.log(result.username);
                    console.log(result.password);
                    console.log("-----");
                    // 个人推荐
                    console.log(result["username"]);
                    console.log(result["password"]);
                    console.log(result);
                }
            });
        }

        // function check() {
        //     let username = $("#username").val();
        //     let password = $("#password").val();
        //     //post方法用jason方式传值
        //     $.post(
        //         "login",
        //         {"username": username, "password": password},
        //         function (result) {
        //             alert(1);
        //         }
        //     );
        // }
    </script>
</head>
<body>
<h2>Hello World!</h2>
<%--<form action="login">--%>
username:<input type="text" name="username" id="username"><span></span>
<br>
password: <input type="password" name="password" id="password"><span></span>
<br>
email: <input type="email" name="email">
<br>
<input type="submit" value="submit" onclick="check()">
<%--</form>--%>
</body>
</html>
