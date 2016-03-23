<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>DedeCms menu</title>
<link rel="stylesheet" href="<spring:message code="url.main" />css/base.css" type="text/css" />
<script language="javascript" type="text/javascript"
	src="<spring:message code="url.main" />js/dedeajax2.js"></script>
<script src="<spring:message code="url.main" />js/jquery/jquery.js" language="javascript"
	type="text/javascript"></script>
<script language='javascript'>
	var curopenItem = '1';
</script>
<script language="javascript" type="text/javascript"
	src="<spring:message code="url.main" />js/leftmenu.js"></script>
<style>
div {
	padding: 0px;
	margin: 0px;
}

body {
	padding: 0px;
	margin: auto;
	text-align: center;
	background-color: #eff5ed;
	background: url(images/leftmenu_bg.gif);
	padding-left: 3px;
	overflow: scroll;
	overflow-x: hidden;
	scrollbar-face-color: #eff8e6;
	scrollbar-shadow-color: #edf2e3;
	scrollbar-highlight-color: #ffffff;
	scrollbar-3dlight-color: #F2F2F2;
	scrollbar-darkshadow-color: #bdbcbd;
	scrollbar-arrow-color: #bdbcbd
}

dl.bitem {
	clear: both;
	width: 140px;
	margin: 0px 0px 5px 12px;
	background: url(<spring:message code="url.main" />images/menunewbg.gif) repeat-x;
}

dl.bitem2 {
	clear: both;
	width: 140px;
	margin: 0px 0px 5px 12px;
	background: url(<spring:message code="url.main" />images/menunewbg2.gif) repeat-x;
}

dl.bitem dt, dl.bitem2 dt {
	height: 25px;
	line-height: 25px;
	padding-left: 35px;
	cursor: pointer;
}

dl.bitem dt b, dl.bitem2 dt b {
	color: #4D6C2F;
}

dl.bitem dd, dl.bitem2 dd {
	padding: 3px 3px 3px 3px;
	background-color: #fff;
}

div.items {
	clear: both;
	padding: 0px;
	height: 0px;
}

.fllct {
	float: left;
	width: 85px;
}

.flrct {
	padding-top: 3px;
	float: left;
}

.sitemu li {
	padding: 0px 0px 0px 18px;
	line-height: 22px;
	background: url(<spring:message code="url.main" />images/arr4.gif) no-repeat 5px 9px;
}

ul {
	padding-top: 3px;
}

li {
	height: 22px;
}

a.mmac div {
	background: url(<spring:message code="url.main" />images/leftbg2.gif) no-repeat;
	height: 37px !important;
	height: 47px;
	padding: 6px 4px 4px 10px;
	word-wrap: break-word;
	word-break: break-all;
	font-weight: bold;
	color: #325304;
}

a.mm div {
	background: url(<spring:message code="url.main" />images/leftmbg1.gif) no-repeat;
	height: 37px !important;
	height: 47px;
	padding: 6px 4px 4px 10px;
	word-wrap: break-word;
	word-break: break-all;
	font-weight: bold;
	color: #475645;
	cursor: pointer;
}

a.mm:hover div {
	background: url(<spring:message code="url.main" />images/leftbg2.gif) no-repeat;
	color: #4F7632;
}

.mmf {
	height: 1px;
	padding: 5px 7px 5px 7px;
}

#mainct {
	padding-top: 8px;
	background: url(<spring:message code="url.main" />images/idnbg1.gif) repeat-y;
}
</style>
<link href="<spring:message code="url.main" />images/style2/style.css" rel="stylesheet" type="text/css" />
<base target="main" />
</head>
<body target="main" onLoad="CheckOpenMenu();">
	<table width="180" align="left" border='0' cellspacing='0'
		cellpadding='0' style="text-align: left;">
		<tr>

			<td width='100%' id='mainct' valign="top">

				<div id='ct1'>
					<!-- Item 2 Strat -->
					<dl class='bitem' id='sunitems1_1'>
						<dt onClick='showHide("items1_1")'>
							<b>常用操作</b>
						</dt>
						<dd style='display: block' class='sitem' id='items1_1'>
							<ul class='sitemu'>

								<li><a href='index.jsp' target='main'>密码修改</a></li>
								<li><a href='cacheclear'
									target='main' style='color: #a00000'>清空缓存！</a></li>
							</ul>
						</dd>
					</dl>
				
					<!-- Item 2 End -->
					<!-- Item 3 Strat -->
					<dl class='bitem' id='sunitems2_1'>
						<dt onClick='showHide("items2_1")'>
							<b>内容管理</b>
						</dt>
						<dd style='display: block' class='sitem' id='items2_1'>
							<ul class='sitemu'>
								<li><a href='sclass' target='mainFrame'>类别管理</a></li>
								<li><a href='addclass' target='mainFrame'>添加分类</a></li>
								<li><a href='sapp' target='mainFrame'>应用管理</a></li>
						<li><a href='addapp' target='mainFrame'>添加应用</a></li>
								
							</ul>
						</dd>
					</dl>
				</div>
				<div id='ct100'></div>
				<div id='ct3'></div>
				<div id='ct5'></div>
				<div id='ct6'></div>
				<div id='ct7'></div>
				<div id='ct20'></div>
				<div id='ct10'></div>
			</td>
		</tr>
		<tr>
			<td width='100%' valign='top'><img src='<spring:message code="url.main" />images/idnbgfoot.gif' />
			</td>
		</tr>
	</table>
</body>
</html>