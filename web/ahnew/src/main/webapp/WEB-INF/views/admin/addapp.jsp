
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>添加修改APP信息</title> <script type="text/javascript"
		src="<spring:message code="url.main" />js/jquery-1.7.2.min.js"></script>
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
textarea {
	width: 440px;
	height: 90px;
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
			id="ddcategory" name="ddcategory" value="4"/>

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
		<script type="text/javascript">
function showpic(obj,obj2)
{

	var value=$(obj).val();
	var dei=document.getElementById(obj2);
	
	$(dei).html("");
	var values=value.split(',');
	for(var i=0;i<values.length;i++){
	//var imgtd=document.createElement("td");
	if(values[i]!="")
	$(dei).html($(dei).html()+"<img src='"+values[i]+"' style='width:50px;margin-left:10px;'/>");
	}
	
}
function check(){
	if($("#ddappname").val()=="")
		{
		alert("应用名称不能为空!");
		return false;
		}
	if($("#ddfapk").val()=="")
	{
	alert("手表应用不能为空!");
	return false;
	}
	
	if($("#ddmapk").val()=="")
	{
	alert("手机应用不能为空!");
	return false;
	}
	
	submit();
	
}
</script>

		<table width="100%" border="0" cellpadding="3" cellspacing="1"
			style="margin: 10px auto; color: #858585">


			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>*应用名称</strong></td>
				<td class="std"><input type="text" id="ddappname"
					name="ddappname" /></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>分类</strong></td>
				<td class="std"><select name="ddcategorys" id="ddcategorys"
					onchange="document.getElementById('ddcategory').value=this.value;">${category}</select></td>

			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>开发者</strong></td>
				<td class="std"><input type="text" id="dddeveloper"
					name="dddeveloper" /></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>版本名称</strong></td>
				<td class="std"><input type="text" id="ddvername"
					name="ddvername" /></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>包名</strong></td>
				<td class="std"><input type="text" id="ddpackagebody"
					name="ddpackagebody" /></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>版本号</strong></td>
				<td class="std"><input type="text" id="ddvercode"
					name="ddvercode" /></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>排序</strong></td>
				<td class="std"><input type="text" id="ddsortorder"
					name="ddsortorder" value="0"/></td>
			</tr>

			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>一句话描述</strong></td>
				<td class="std"><input type="text" id="ddsummary"
					name="ddsummary" /></td>
			</tr>

			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>应用介绍</strong></td>
				<td class="std"><textarea id="dddescript"
					name="dddescript" ></textarea></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>应用图标</strong></td>
				<td class="std"><button
						onclick="document.getElementById('ddsend').value='ddlogourl';showUpLogo(this);return false;">上传应用图标</button></td>

			</tr>
			
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>*图标地址</strong></td>
				<td class="std"><input type="text" id="ddlogourl"
					name="ddlogourl" onclick="showpic(this,'vlogo')" /><input type="hidden" id="ddlogourlsize" value="0"
					name="ddlogourlsize" /></td>

			</tr>
			<tr align="center" bgcolor="#FBFCE2">
			<td><strong>*图标</strong></td>
				<td class="std" id='vlogo' style="text-align:left"></td></tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>*应用截图</strong></td>
				<td class="std"><button
						onclick="document.getElementById('ddsend').value='dddetailurl';showUpLogo(this);return false;">上传截图</button></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>上传详情图片地址</strong></td>
				<td class="std"><input type="text" id="dddetailurl"
					name="dddetailurl"  onclick="showpic(this,'vimg')"/><input type="hidden" id="dddetailurlsize"  value="0"
					name="dddetailurlsize" /></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
			<td><strong>*截图</strong></td>
				<td class="std" id='vimg'  style="text-align:left"></td></tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>*上传手机应用</strong></td>
				<td class="std"><button
						onclick="document.getElementById('ddsend').value='ddmapk';showUpLogo(this);return false;">上传手机应用</button></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>手机应用地址</strong></td>
				<td class="std"><input type="text" id="ddmapk" name="ddmapk" /><input type="hidden" id="ddmapksize" name="ddmapksize"  value="0"/></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>*上传手表应用</strong></td>
				<td class="std"><button
						onclick="document.getElementById('ddsend').value='ddfapk';showUpLogo(this);return false;">上传手表应用</button></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td><strong>手表应用地址</strong></td>
				<td class="std"><input type="text" id="ddfapk" name="ddfapk" /><input type="hidden" id="ddfapksize" name="ddfapksize"  value="0"/></td>
			</tr>
			<tr align="center" bgcolor="#FBFCE2">
				<td colspan="2"><button
						onclick="document.getElementById('ddpost').value='posted';check();">确定</button>
				</td>
			</tr>
		</table>
		${result }

		<div align="center">&nbsp;</div>
		<iframe src='upload.jsp?m=Math(9)'
			style='display: none; width: 600px; height: 300px; background: #fff'
			id="ddupfile" name="ddupfile" />

	</form>
</body>

</html>

