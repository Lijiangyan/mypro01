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
    <link rel="stylesheet" href="/css/green.css">
    <script src="js/jquery.js"></script>
    <title>心理测试</title>
    <style type="text/css">
        body {
            line-height: 20px;
        }
        img {
            width: 200px;
            height: 130px;
        }
        nav {
            margin-bottom: 30px;
        }
        .main-left {
            width: 100%;
            float: left;
            margin-left: 20px;
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
        .ans_submit {
            width: 60%;
            height: 50px;
            background-color: #00B16A;
        }
    </style>

    <script>

        function queSubmit() {
//            var allQA = "";
//            $('#ques_form').find('input');
//            $.each($('#ques_form').find('input'), function(i, obj){
//                if (obj.checked) {
//                    var questionId = obj.getAttribute("name");
//                    var optionId = obj.getAttribute("value");
//                    allQA += "questionId=" + questionId + "&optionId=" + optionId +"&";
//                }
//            });
//            $('#ques_form').val().replace(allQA);
//            alert($('#ques_form').val());
            $('#ques_form').submit();
        }


    </script>

</head>
<body>
    <nav class="navbar navbar-dark navbar-full">
        <div>
            <div>
                <%--<a class="navbar-brand" href="">心理测试</a>--%>
                <ul class="nav navbar-nav">
                    <li class="nav-item"><a href="">爱情测试</a></li>
                    <li class="nav-item"><a href="">性格测试</a></li>
                    <li class="nav-item"><a href="">能力测试</a></li>
                    <li class="nav-item"><a href="">会员测试</a></li>
                    <li class="nav-item"><a href="">精选测试</a></li>
                    <li class="nav-item"><a href="">专业测试</a></li>
                    <%--<s:iterator value="moduleNames" var="o">--%>
                        <%--<li class="nav-item"><a><s:property value="o" /></a></li>--%>
                    <%--</s:iterator>--%>
                </ul>
            </div>
        </div>
    </nav>

    <div>
        <%--左边--%>
        <div class="main-left">
            <form id="ques_form" method="get" action="/test_answer.action" onsubmit="return queSubmit()">
                <s:iterator value="questionAndOptsList" var="qo_map" status="ques_st">
                    <p>
                        <s:property value="#ques_st.getIndex()+1"></s:property>
                    <s:property value="#qo_map['question'].title"></s:property>
                    </p>
                    <s:iterator value="#qo_map['options']" var="option">
                        <input type="radio" name="<s:property value="#option.question.id"></s:property>" value="<s:property value="#option.id"></s:property>" />
                        <s:property value="#option.title"></s:property>
                        <br />
                    </s:iterator>
                    <hr />
                </s:iterator>
                <input class="ans_submit btn btn-danger" type="submit" value="提交" />
            </form>

        </div>
    </div>

</body>
</html>
