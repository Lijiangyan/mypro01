<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: LJ
  Date: 16/7/19
  Time: 下午8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <link rel="stylesheet" href="/css/main.css">
    <style type="text/css">
        .answer {
            margin: 20px 50px;
        }
    </style>
</head>
<body>
    <nav id="header" class="navbar navbar-dark navbar-full">
        <div>
            <a class="navbar-brand" href="https://laverna.cc">
                <img src="images/logo.svg" class="navbar--logo">
            </a>
            <ul class="nav navbar-nav pull-xs-right">
                <li class="nav-item">
                    <a href="login.jsp" class="nav-link">登录</a>
                </li>
                <li class="nav-item">
                    <a href="register.jsp" class="nav-link">注册</a>
                </li>
            </ul>
        </div>
    </nav>

    <hr />
    <h3 style="text-align: center">请看仔细了~~</h3>
    <br />
    <div class="answer">
        <h4><p><s:property value="result.description"></s:property></p></h4>
    </div>

</body>
</html>
