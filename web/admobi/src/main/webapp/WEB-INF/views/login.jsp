<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>数字天域后台管理页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="szty">
    <meta name="author" content="szty">
    <!-- The styles -->
    <link id="bs-css" href="charisma/css/bootstrap-cerulean.min.css" rel="stylesheet">
    <link href="charisma/css/charisma-app.css" rel="stylesheet">
    <link href='charisma/bower_components/fullcalendar/dist/fullcalendar.css' rel='stylesheet'>
    <link href='charisma/bower_components/fullcalendar/dist/fullcalendar.print.css' rel='stylesheet' media='print'>
    <link href='charisma/bower_components/chosen/chosen.min.css' rel='stylesheet'>
    <link href='charisma/bower_components/colorbox/example3/colorbox.css' rel='stylesheet'>
    <link href='charisma/bower_components/responsive-tables/responsive-tables.css' rel='stylesheet'>
    <link href='charisma/bower_components/bootstrap-tour/build/css/bootstrap-tour.min.css' rel='stylesheet'>
    <link href='charisma/css/jquery.noty.css' rel='stylesheet'>
    <link href='charisma/css/noty_theme_default.css' rel='stylesheet'>
    <link href='charisma/css/elfinder.min.css' rel='stylesheet'>
    <link href='charisma/css/elfinder.theme.css' rel='stylesheet'>
    <link href='charisma/css/jquery.iphone.toggle.css' rel='stylesheet'>
    <link href='charisma/css/uploadify.css' rel='stylesheet'>
    <link href='charisma/css/animate.min.css' rel='stylesheet'>
    <!-- jQuery -->
    <script src="../charisma/bower_components/jquery/jquery.min.js"></script>
    <!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <!-- The fav icon -->
    <link rel="shortcut icon" href="charisma/img/favicon.ico">

</head>

<body>
<div class="ch-container">
    <div class="row">
        
    <div class="row">
        <div class="col-md-12 center login-header">
            <h2>数字天域 欢迎你</h2>
        </div>
        <!--/span-->
    </div><!--/row-->

    <div class="row">
        <div class="well col-md-5 center login-box">
            <div class="alert alert-info">
                	请输入用户名和密码
            </div>
            <form class="form-horizontal" action="j_spring_security_check" method="post">
                <fieldset>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user red"></i></span>
                        <input type="text" class="form-control" placeholder="用户名" >
                    </div>
                    <div class="clearfix"></div><br>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock red"></i></span>
                        <input type="password" class="form-control" placeholder="密码" >
                    </div>
                    <div class="clearfix"></div>
                    <div class="input-prepend">
                        <label class="remember" for="remember"><input type="checkbox" id="remember">记住密码</label>
                    </div>
                    <div class="clearfix"></div>

                    <p class="center col-md-5">
                        <button type="submit" class="btn btn-primary">Login</button>
                    </p>
                </fieldset>
            </form>
        </div>
        <!--/span-->
    </div><!--/row-->
</div><!--/fluid-row-->

</div><!--/.fluid-container-->

<!-- external javascript -->

<script src="../charisma/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

<!-- library for cookie management -->
<script src="../charisma/js/jquery.cookie.js"></script>
<!-- calender plugin -->
<script src='../charisma/bower_components/moment/min/moment.min.js'></script>
<script src='../bower_components/fullcalendar/dist/fullcalendar.min.js'></script>
<!-- data table plugin -->
<script src='../charisma/js/jquery.dataTables.min.js'></script>

<!-- select or dropdown enhancer -->
<script src="../charisma/bower_components/chosen/chosen.jquery.min.js"></script>
<!-- plugin for gallery image view -->
<script src="../charisma/bower_components/colorbox/jquery.colorbox-min.js"></script>
<!-- notification plugin -->
<script src="../charisma/js/jquery.noty.js"></script>
<!-- library for making tables responsive -->
<script src="../charisma/bower_components/responsive-tables/responsive-tables.js"></script>
<!-- tour plugin -->
<script src="../charisma/bower_components/bootstrap-tour/build/js/bootstrap-tour.min.js"></script>
<!-- star rating plugin -->
<script src="../charisma/js/jquery.raty.min.js"></script>
<!-- for iOS style toggle switch -->
<script src="../charisma/js/jquery.iphone.toggle.js"></script>
<!-- autogrowing textarea plugin -->
<script src="../charisma/js/jquery.autogrow-textarea.js"></script>
<!-- multiple file upload plugin -->
<script src="../charisma/js/jquery.uploadify-3.1.min.js"></script>
<!-- history.js for cross-browser state change on ajax -->
<script src="../charisma/js/jquery.history.js"></script>
<!-- application script for Charisma demo -->
<script src="../charisma/js/charisma.js"></script>
</body>
</html>