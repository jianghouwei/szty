<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	System.out.print(basePath);
%>
<head>
<meta charset="UTF-8" />
<!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
<title>数字天域后台管理页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="szty">
<meta name="author" content="szty">
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css" href="charisma/css/demo.css" />
<link rel="stylesheet" type="text/css" href="charisma/css/style3.css" />
<link rel="stylesheet" type="text/css" href="charisma/css/animate-custom.css" />
</head>
<body>
	<div class="container">
		<header>
		<h1>
			数字天域欢迎您！
		</h1>
		</header>
		<section>
		<div id="container_demo">
			<a class="hiddenanchor" id="toregister"></a> <a class="hiddenanchor"
				id="tologin"></a>
			<div id="wrapper">
				<div id="login" class="animate form">
					<form action="login" autocomplete="on">
						<h1>登录</h1>
						<p>
							<label for="username" class="uname" data-icon="u"> 邮箱/用户名</label> 
							<input id="userName" name="userName"
								required="required" type="text"
								placeholder="用户名/邮箱" />
						</p>
						<p>
							<label for="password" class="youpasswd" data-icon="p">
								密码</label> <input id="passWord" name="passWord"
								required="required" type="password" placeholder="密码" />
						</p>
						<p class="keeplogin">
							<input type="checkbox" name="loginkeeping" id="remember"
								value="remember" /> <label for="loginkeeping">记住密码</label>
						</p>
						<p class="login button">
							<input type="submit" value="登录" />
						</p>
						<!-- <p class="change_link">
							Not a member yet ? <a href="#toregister" class="to_register">Join
								us</a>
						</p> -->
					</form>
				</div>

				<!-- <div id="register" class="animate form">
					<form action="mysuperscript.php" autocomplete="on">
						<h1>Sign up</h1>
						<p>
							<label for="usernamesignup" class="uname" data-icon="u">Your
								username</label> <input id="usernamesignup" name="usernamesignup"
								required="required" type="text" placeholder="mysuperusername690" />
						</p>
						<p>
							<label for="emailsignup" class="youmail" data-icon="e">
								Your email</label> <input id="emailsignup" name="emailsignup"
								required="required" type="email"
								placeholder="mysupermail@mail.com" />
						</p>
						<p>
							<label for="passwordsignup" class="youpasswd" data-icon="p">Your
								password </label> <input id="passwordsignup" name="passwordsignup"
								required="required" type="password" placeholder="eg. X8df!90EO" />
						</p>
						<p>
							<label for="passwordsignup_confirm" class="youpasswd"
								data-icon="p">请设置密码 </label> <input
								id="passwordsignup_confirm" name="passwordsignup_confirm"
								required="required" type="password" placeholder="eg. X8df!90EO" />
						</p>
						<p class="signin button">
							<input type="submit" value="Sign up" />
						</p>
						<p class="change_link">
							Already a member ? <a href="#tologin" class="to_register"> Go
								and log in </a>
						</p>
					</form>
				</div> -->

			</div>
		</div>
		</section>
	</div>
</body>
</html>