<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	System.out.print(basePath);
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数字天域后台管理页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="szty">
<meta name="author" content="szty">
<!-- The styles -->
<link href="charisma/css/bootstrap-cerulean.min.css" rel="stylesheet">
<link href="charisma/css/charisma-app.css" rel="stylesheet">
</head>

<body>
	<div class="ch-container">
		<div class="row">

			<div class="row">
				<div class="col-md-12 center login-header">
					<h2>数字天域 欢迎你</h2>
				</div>
				<!--/span-->
			</div>
			<!--/row-->

			<div class="row">
				<div class="well col-md-5 center login-box">
					<div class="alert alert-info">请输入用户名和密码</div>
					<form class="form-horizontal" action="login" method="post">
						<fieldset>
							<div class="input-group input-group-lg">
								<span class="input-group-addon"><i
									class="glyphicon glyphicon-user red"></i></span> <input type="text"
									class="form-control" placeholder="用户名" id="userName"
									name="userName">
							</div>
							<div class="clearfix"></div>
							<br>
							<div class="input-group input-group-lg">
								<span class="input-group-addon"> <i
									class="glyphicon glyphicon-lock red"></i>
								</span> <input type="password" class="form-control" placeholder="密码"
									id="passWord" name="passWord">
							</div>
							<div class="clearfix"></div>
							<div class="input-prepend">
								<label class="remember" for="remember">
								<input type="checkbox" id="remember" id="" name="">记住密码</label>
							</div>
							<div class="clearfix"></div>

							<p class="center col-md-5">
								<button type="submit" class="btn btn-primary">Login</button>
							</p>
						</fieldset>
					</form>
				</div>
				<!--/span-->
			</div>
			<!--/row-->
		</div>
		<!--/fluid-row-->
	</div>
</body>
</html>