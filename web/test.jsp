<%--
  Created by IntelliJ IDEA.
  User: LJ
  Date: 16/7/20
  Time: 上午10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link rel="stylesheet" href="/css/main.css">
    <title>心理测试</title>
    <style type="text/css">
        body {
            line-height: 20px;
        }
        img {
            width: 200px;
            height: 130px;
        }
        .main-left {
            width: 100%;
            float: left;
        }
        .category {
            margin-bottom: 20px;
        }
        .list {
            margin-left: 10px;
            display: block;
            width: 110%;
            float: left;
        }
        .part {
            width: 40%;
            float: left;
            display: inline;
            margin-right: 20px;
        }
        .category-title {
            margin-left: 10px;
            margin-top: 10px;
            margin-bottom: 10px;
            font-size: 16px;
            float : left;
        }


    </style>
</head>
<body>
    <nav class="navbar navbar-dark navbar-full">
        <div>
            <div>
                <%--<a class="navbar-brand" href="">心理测试</a>--%>
                <ul class="nav navbar-nav navbar-full">
                    <%--<li class="nav-item"><a href="">爱情测试</a></li>--%>
                    <%--<li class="nav-item"><a href="">性格测试</a></li>--%>
                    <%--<li class="nav-item"><a href="">能力测试</a></li>--%>
                    <%--<li class="nav-item"><a href="">会员测试</a></li>--%>
                    <%--<li class="nav-item"><a href="">精选测试</a></li>--%>
                    <%--<li class="nav-item"><a href="">专业测试</a></li>--%>
                    <s:iterator value="moduleNames" var="o">
                        <li class="nav-item"><a><s:property value="o" /></a></li>
                    </s:iterator>
                </ul>
            </div>
        </div>
    </nav>



    <div>
        <%--左边--%>
        <div class="main-left">
            <%--焦点图+目录--%>
            <s:iterator value="moduleNames" var="mName" status="moduleStatus">
                <div class="category">
                    <h2 class="category-title">
                        <a ><s:property value="mName"/></a> <br />
                    </h2>

                    <div class="list">
                        <s:iterator value="suiteList[#moduleStatus.index]" var="suite" status="suiteStatus">
                        <%--2行列表--%>
                            <div class="part">
                                <dl>
                                    <dt>
                                        <p>
                                            <a href="${pageContext.request.contextPath}/test_question.action?suitId=<s:property value="id"></s:property>">
                                                <img src="<s:property value="imgUrl"></s:property>">
                                            </a>
                                        </p>
                                        <p>
                                            <a href=""><s:property value="name"></s:property></a>
                                            <br/>
                                            <s:property value="description"></s:property>
                                            <span><s:property value="testCount"></s:property></span>
                                        </p>
                                    </dt>
                                </dl>
                            </div>
                        </s:iterator>
                    </div>
                </div>
            </s:iterator>
        </div>
    </div>


</body>
</html>
