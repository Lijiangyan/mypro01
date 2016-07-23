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
</head>
<body>
    <nav id="header" class="navbar navbar-dark navbar-full">
        <div class="container">
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
    <section id="intro" class="page -intro">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 -page-intro description">
                    <h1 class="-page-intro title">1号心理</h1>
                    <h2 class="-page-intro title--description">这是一个神奇的心理网站</h2>
                    <div class="btn--group -page-intro">
                        <a class="btn -page-intro -start" href="app">来测试吧</a>
                        <a class="btn -page-intro -download" href="#download">下载</a>
                    </div>
                </div>
            </div>
        </div>
    </section>

</body>
</html>
