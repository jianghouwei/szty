<%@page import="com.szty.aihao.page.login"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>登陆</title>
<link href="<spring:message code="url.main" />css/admin.css" rel="stylesheet"
	type="text/css" />
</head>
<body>
	<br />
	<br />
	<br />
	<form id="form1">
	<input type="hidden" name="post" id="post" value="" />
		<table border="0" cellpadding="0" cellspacing="0" align="center"
			width="476" height="298"
			background="<spring:message code="url.main" />images/login_back.jpg">
			<tr height="110">
				<td colspan="5"></td>
			</tr>
			<tr>
				<td width="60"></td>
				<td class="labeltext" width="100">用户名:</td>
				<td><input type="text" name="ddname" id="ddname" /></td>
				<td></td>
				<td width="60"></td>
			</tr>
			<tr>
				<td width="60"></td>
				<td class="labeltext" width="100">密码:</td>
				<td><input type="password" name="ddpass" id="ddpass" /></td>
				<td></td>
				<td width="60"></td>
			</tr>
			<tr>
				<td width="60"></td>
				<td class="labeltext" width="100">验证码:</td>
				<td><input type="text" name="rand" id="rand" />&nbsp;<img
					src="rand?t=Math.random(9)"
					height="16" border="1" /></td>
				<td></td>
				<td width="60"></td>
			</tr>
			<tr>
				<td colspan="5" align="center"><input type="button" value="确认" onclick="document.getElementById('post').value='posted';this.form.submit();"/>&nbsp;
					<input type="button"  value="取消" /></td>
			</tr>
			<tr height="50">
				<td colspan="5" align="center"></td>
			</tr>
		</table>
	<form>
	<%=login.getDo(request, response) %>
</body>
</html>
