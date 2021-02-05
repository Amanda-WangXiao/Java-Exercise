<%--
  Created by IntelliJ IDEA.
  User: Xiao Wang
  Date: 2021/2/2
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ParamsBind</title>
</head>
<body>
<a href="/params/test1">Test Params</a>

<form action="/params/saveAccount" method="post">
    姓名: <input type="text" name="username"><br/>
    金额: <input type="text" name="money"><br/>
<%--    密码: <input type="text" name="user.password"><br/>--%>
<%--    年龄: <input type="text" name="user.age"><br/>--%>

        日期: <input type="text" name="date"><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
