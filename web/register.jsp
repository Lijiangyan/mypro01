<%--
  Created by IntelliJ IDEA.
  User: LJ
  Date: 16/7/20
  Time: 上午9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
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
        #select {
            width: 145px;
            height: 27px;
        }
    </style>
</head>
<body style="text-align: center">
<form action="${pageContext.request.contextPath}/user_register.action" method="get">
    <table>

        <tr>
            <td>用户名</td>
            <td><input type="text" name="user.loginName" value="" /></td>
        </tr>
        <tr>
            <td>密&nbsp;&nbsp;&nbsp;码</td>
            <td><input type="password" name="user.loginPswd" value="" /></td>
        </tr>
        <tr>
            <td>昵&nbsp;&nbsp;&nbsp;称</td>
            <td><input type="text" name="user.name" value="" /></td>
        </tr>
        <tr>
            <td colspan="2"><input id="submit" type="submit" value="注  册" /></td>
        </tr>
    </table>

</form>
</body>
</html>