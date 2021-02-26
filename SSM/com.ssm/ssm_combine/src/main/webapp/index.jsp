<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
    <a href="/AccountService/findAll">测试findAll</a><br/>

    <form action="/AccountService/saveAccount">
        ID: <input type="text" name="id"/><br/>
        姓名: <input type="text" name="username"/><br/>
        年龄: <input type="text" name="age"/><br/>
        <input type="submit" value="SAVE">
    </form>

</body>
</html>