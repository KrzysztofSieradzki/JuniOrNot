<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>TravelDex</title>
    <link href="../../static/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!--external css-->
    <link href="../../static/lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="../../static/css/style.css" rel="stylesheet">
    <link href="../../static/css/style-responsive.css" rel="stylesheet">
</head>
<body>
<header class="header black-bg">
    <!--logo start-->
    <a href="/" class="logo" id="linklogo"><b>Juni<span>Or</span>Not</b></a>
    <!--logo end-->
    <div class="nav notify-row" id="top_menu">

    </div>
    <div class="top-menu">
        <ul class="nav pull-right top-menu">
            <li>
               <div style="margin-top: 15px; padding: 5px 15px;color: #f2f2f2;font-size: 18px;">
                   Hello <strong>${pageContext.request.userPrincipal.principal.username}</strong></div>
            </li>
            <li>
                <a class="logout" href="/logout">Logout</a>
            </li>
        </ul>
    </div>
</header>
</body>
</html>
