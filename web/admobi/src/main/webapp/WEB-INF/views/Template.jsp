<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>会员管理</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
<meta name="author" content="Muhammad Usman">
<jsp:include page="common/head.jsp" />
</head>
<body>
	<!-- topbar starts -->
	<jsp:include page="common/topbar.jsp" flush="true" />
	<!-- topbar ends -->
	<div class="ch-container">
		<div class="row">
			<!-- left menu starts -->
			<jsp:include page="common/left.jsp" flush="true" />
			<!-- left menu ends -->
			<div id="content" class="col-lg-10 col-sm-10">
				<div>
					<ul class="breadcrumb">
						<li><a href="#">系统管理</a></li>
						<li><a href="#">会员管理</a></li>
					</ul>
				</div>
				<!-- content starts -->
				<!-- 页面名字 -->
			    <!-- content ends -->
				</div>
			</div>
		</div>
		<!--/fluid-row-->
		<jsp:include page="common/footer.jsp" flush="true" />
	</div>
</html>