<%--
  Created by IntelliJ IDEA.
  User: LJ
  Date: 16/7/20
  Time: 上午9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
    <style type="text/css">
        body {
            background-image: linear-gradient(to bottom,#71BA51 0,#00B16A 100%);
        }
        table {
            margin: 30px auto;
            width: 320px;
        }
        tr {
            height: 40px;
            font-size: 16px;

        }
        #submit {
            font-size: 16px;
            width: 190px;
        }
    </style>
</head>
<body style="text-align: center">
<h2 style="color: #fff" >用户登录</h2>

<form action="${pageContext.request.contextPath}/user_login.action" method="get">
    <table>
        <tr>
            <td><input class="form-control" type="text" name="user.loginName" value="" placeholder="用户名"/></td>
        </tr>
        <tr>
            <td><input class="form-control" type="password" name="user.loginPswd" value="" placeholder="密 码"/></td>
        </tr>
        <tr>
            <td><button class="btn btn-block btn-danger" type="submit">登 录</button></td>
        </tr>
    </table>

</form>
</body>

</html>