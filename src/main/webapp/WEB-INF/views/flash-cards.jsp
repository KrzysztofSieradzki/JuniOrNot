<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="../../static/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!--external css-->
    <link href="../../static/lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="../../static/css/style.css" rel="stylesheet">
    <link href="../../static/css/style-responsive.css" rel="stylesheet">
    <script src="../../static/lib/chart-master/Chart.js" type="text/javascript"></script>
</head>
<body>
 <section id="container">
  <header><jsp:include page="fragments/header.jsp"/></header>
    <section id="main-content">
        <section class="wrapper">
            <div class="row">

             <!-- ----------Start----------- --!>
               <form method="post" class="form-login" action="/flash_cards/settings">
               <h2 class="form-login-heading">Game settings</h2>
               <div class="login-wrap">
                <label class="control-label col-md-3" for="language" style="text-align: center; width: 100%;">Technology</label>
                <select class="form-control" required name="language" id="language">
                <!--    <option>--Choose technology--</option> --!>
                    <c:forEach items="${languages}" var="lan">
                        <option value="${lan}">${lan.languages}</option>
                    </c:forEach>
                </select>
                <hr>

                <label class="control-label col-md-3" style="text-align: center; width: 100%;" for="difficulty">Difficulty</label>
                <select class="form-control" required name="difficulty" id="difficulty">
                    <c:forEach items="${difficulties}" var="diff">
                      <option value="${diff}">${diff.difficulties}</option>
                    </c:forEach>
                </select>

                 <hr>
                    <button class="btn btn-theme btn-block" type="submit">Play!</button>
                    <button class="btn btn-theme02 btn-block" type="reset">Reset</button>
               </div>
               </form>


             <!-- ------------End-------------- --!>

            </div>
        </section>
    </section>
    <!-- js placed at the end of the document so the pages load faster -->
    <script src="../../static/lib/jquery/jquery.min.js"></script>
    <script src="../../static/lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="../../static/lib/jquery-ui-1.9.2.custom.min.js"></script>
    <script src="../../static/lib/jquery.ui.touch-punch.min.js"></script>
    <script class="include" type="text/javascript" src="../../static/lib/jquery.dcjqaccordion.2.7.js"></script>
    <script src="../../static/lib/jquery.scrollTo.min.js"></script>
    <script src="../../static/lib/jquery.nicescroll.js" type="text/javascript"></script>
    <script type="text/javascript" src="../../static/lib/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("../../static/image/start_page.jpg", {
            speed: 500
        });
    </script>
    <!--common script for all pages-->
    <script src="../../static/lib/common-scripts.js"></script>
    <!--script for this page-->
 </section>
 <div style="clear: both;"></div>
                    <footer class="site-footer" style="object-position: bottom">
                        <jsp:include page="fragments/footer.jsp"/>
                    </footer>
</body>
</html>