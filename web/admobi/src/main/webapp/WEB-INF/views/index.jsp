<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<jsp:include page="base/head.jsp" />
</head>
<body>
</head>
<body class="easyui-layout">
	<!-- 顶部 -->
	<jsp:include page="base/north.jsp" />
	<!-- 菜单 -->
	<jsp:include page="base/west.jsp" />
	<!-- 底部 -->
	<jsp:include page="base/south.jsp" />
	<!-- 内容 -->
	<jsp:include page="base/center.jsp" />
</body>
</body>
</html>