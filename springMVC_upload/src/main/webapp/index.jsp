<html>
<script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>
    <script>
       function ajax(){
           let v1 = $("#name").val();
           let v2 = $("#pwd").val();
           $.post(
               "hello",
               {"username":v1,"password":v2},
               function (result) {
                   alert(1);
                   console.log(result);
               }
           )
       }
    </script>
<body>
<h2>Hello World!</h2>
    <input type="text" name="username" id="name">
    <input type="text" name="password" id="pwd">
<button onclick="ajax()">click</button>
<br>
<form action="upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="text" name="desc">
    <input type="submit" value="submit">
</form>
<br>
<div style="background: red">
    <form action="upload2" method="post" enctype="multipart/form-data">
        <input type="text" name="name">
        <input type="text" name="password">
        <input type="file" name="file">
        <input type="submit" value="submit">
    </form>
</div>
</body>
</html>
