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
    <style type="text/css">
        table {
            margin: 30px auto ;
        }
        tr {
            height:40px;
            font-size: 16px;
        }
        #submit {
            font-size: 16px;
            width: 190px;
        }
    </style>
</head>
<body style="text-align: center">
<h2>用户登录</h2>
<hr />
<form action="${pageContext.request.contextPath}/user_login.action" method="get">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="user.loginName" value="" /></td>
        </tr>
        <tr>
            <td>密  码</td>
            <td><input type="password" name="user.loginPswd" value="" /></td>
        </tr>
        <tr>
            <td colspan="2"><input id="submit" type="submit" value="登 录" /></td>
        </tr>
    </table>

</form>
</body>
</html>