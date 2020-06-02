<%--
  Created by IntelliJ IDEA.
  User: Sony
  Date: 02.06.2020
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="JuniOrNot">
    <meta name="keyword" content="junior, java, sql, test">
    <title>JuniOrNot</title>
</head>
<body>
<div id="login-page">
    <div class="container">

        <form method="post" class="form-login" action="/login">
            <h2 class="form-login-heading">sign in now</h2>
            <div class="login-wrap">
                <input type="text" required name="username" id="username" class="form-control" placeholder="Username" autofocus>
                <br>
                <input type="password" required name="password" id="password" class="form-control" placeholder="Password">
                <br>
                <input type="email" required name="email" id="email" class="form-control" placeholder="Email">
                <br>
                <c:if test="${param['error'] != null}">
                    <div style="position:relative;">
                        <h5 style="margin-left: auto; margin-right: auto" class="modal-title">Wrong password or login</h5>
                    </div>
                </c:if>
                <button class="btn btn-theme btn-block" type="submit"><i class="fa fa-lock"></i> SIGN IN</button>

                <hr>

                <div class="registration">
                    Don't have an account yet?<br/>
                    <a class="" href="/register">
                        Create an account
                    </a>
                </div>
            </div>
            <sec:csrfInput/>
        </form>
    </div>
</div>
<script type="text/javascript" src="../../static/lib/jquery.backstretch.min.js"></script>
<script>
    $.backstretch("../../static/image/start page.jpg", {
        speed: 500
    });
</script>
</body>
</html>
