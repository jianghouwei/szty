
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>添加修改分类信息</title>
	<link href="<spring:message code="url.main" />css/base.css"
		rel="stylesheet" type="text/css" />
	<style>
.np {
	border: 0px
}
</style>
	<style type="text/css">
#pagefoot {
	width: 100%, height:25px;
	float：right;
}

#pagefoot ul {
	display: block;
	margin-left: 400px; float：right;
	width: 50%;
}

#pagefoot li a {
	padding-left: 12px;
	margin-left: 5px;
	float: left;
	display: block;
	width: 15px;
	height: 25px;
	background: #858585;
	border: 1px solid #333333
}

.cli li a {
	padding-left: 12px;
	margin-left: 5px;
	float: left;
	display: block;
	width: 15px;
	height: 25px;
	background: #850000
}

.std {
	text-align: left;
	padding-left: 40px;
}

input {
	width: 440px;
	height: 24px;
}

select {
	width: 240px;
	height: 24px;
}

tr {
	height: 30px;
	line-height: 30px;
}

button {
	width: 200px;
	height: 24px;
}
</style>
</head>
<body>
	<form method="post">
		<input type='hidden' name='ddpost' id='ddpost' value='dd' /> <input
			type="hidden" id="ddsend" name="ddsend" /> <input type="hidden"
			id="ddcategory" name="ddcategory" />

		<script type="text/javascript">
			function showUpLogo(obj) {
				var iWidth = 600; //窗口宽度 
				var iHeight = 300;//窗口高度 
				var iTop = (window.screen.height - iHeight - 300) / 2;
				var iLeft = ((window.screen.width) - iWidth - 300) / 2;
				var a = document.getElementById("ddupfile");
				a.src = "uploadlimage?m=Math(9)";
				a.style.display = "block";
				a.style.position = "absolute";
				a.style.left = iLeft + "px";
				a.style.top = iTop + "px";
			}
			${script}
		</script>


		<table width="100%" border="0" cellpadding="3" cellspacing="1"
			style="margin: 10px auto; color: #858585">


			
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>所有分类</strong></td>
				<td class="std"><select name="ddcategorys" id="ddcategorys"
					onchange="document.getElementById('ddcategory').value=this.value;">${category}</select></td>

			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>*添加名称名称</strong></td>
				<td class="std"><input type="text" id="ddappname"
					name="ddappname" /></td>
			</tr>
		
			<tr align="center" bgcolor="#FBFCE2">
				<td colspan="2"><button
						onclick="document.getElementById('ddpost').value='posted';submit();">确定</button>
				</td>
			</tr>
		</table>
		${result }

		<div align="center">&nbsp;</div>
		<iframe src='uploadlimage?m=Math(9)'
			style='display: none; width: 600px; height: 300px; background: #fff'
			id="ddupfile" name="ddupfile" />

	</form>
</body>
</html>

