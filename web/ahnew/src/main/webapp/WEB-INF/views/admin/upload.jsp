<%@page import=" com.szty.aihaonew.OmEditorImageUploadServlet"%>
<%@page import="com.szty.aihao.impl.PropertyUtils"%>
<%@ page import="javax.servlet.ServletInputStream"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>get method</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript"
	src="<spring:message code="url.main" />js/jquery-1.7.2.min.js"></script>
<style type="text/css">
body {
	border: 4px solid #a6a6a6;
}

.tbl td {
	border: 1px solid #008585;
	padding: 3px 3px 3px 3px;
	text-align: center;
	height: 25px;
}

.tbl button {
	width: 220px;
	height: 32px;
	line-height: 32px;
}

.tbl select {
	width: 100px;
	height: 22px;
	line-height: 22px;
}

.tbl {
	border-collapse: collapse;
}

table {
	width: 100%;
	
}

tr {
	width: 100%;
	height: 35px;
	line-height: 35px;
}
</style>
<script type="text/javascript">
	function resStr(obj)
	{
		var a=obj.split(',');
		var inputname=window.parent.document.getElementById("ddsend").value;
		window.parent.document.getElementById(inputname).value="";
		window.parent.document.getElementById(inputname+"size").value="";
		for(var i=0;i<a.length;i++){
			if(a[i]=="")
				break;
			var b=a[i].split("@@");
			window.parent.document.getElementById(inputname).value=window.parent.document.getElementById(inputname).value+b[0]+",";
			window.parent.document.getElementById(inputname+"size").value=window.parent.document.getElementById(inputname+"size").value+b[1]+",";
			
		}
		
		
		window.parent.document.getElementById("ddupfile").style.display="none";
	}
	function close()
	{
		alert("cc");
		window.parent.document.getElementById("ddupfile").style.display="none";
	}
</script>
<style type="text/css">
</style>
</head>
<body>


	<form enctype="multipart/form-data" name="form1" method="post">
		<input type="hidden" name="count" id="count" value="1" /> <input
			name="dvalue" type="text" id="dvalue" value="aaa" />
		<table class="tbl" id="tbl_table">
			<tr>
				<td>AAA文件</td>
				<td><button onclick="add(this);return false;">添加上传文件</button></td>
			</tr>
			<tr>

				<td><input type="file" value="aaaa" name="ufile" /></td>
				<td></td>
			</tr>
			
			<tr id="mmtconfirm">
				<td colspan="2" style="text-align: center"><button
						onclick="sub(this); submit();">文件上传</button></td>

			</tr>
			<tr>
				<td colspan="2" style="text-align: center"><button
						onclick="window.parent.document.getElementById('ddupfile').style.display='none';">返回</button></td>
			</tr>
		</table>

	
	</form>

</body>
</html>
<script type="text/javascript">
function add(obj) {
	var a = document.getElementById("tbl_table");;
	var b = a.getElementsByTagName("tr");
	var newNode = document.createElement("tr");
	var beforeNode = document.getElementById("mmtconfirm");
	$(newNode).html($(b[1]).html());
	
	$(newNode).insertBefore("tr#mmtconfirm");
	
	
}
	function sub(obj) {
		var a = obj.parentNode.parentNode.parentNode;
		var b = a.getElementsByTagName("tr");
		var v = "";
		for ( var i = 1; i < b.length - 1; i++) {
			var d = b[i].getElementsByTagName("input");
			for ( var j = 0; j < d.length; j++) {
				v = v + d[j].value + ",";

			}
			v = v + ";";
		}
		
		document.getElementById("dvalue").value = v;
		
	}
	
	function del(obj) {
		
			var a = obj.parentNode.parentNode;
			var b = obj.parentNode.parentNode.parentNode;
			b.removeChild(a);
			
		
	}
	function res(obj)
	{
		//var a=document.getElementById("dvalue").value;
		//window.parent.document.getElementById("ddappurl").value=a;
		//window.parent.document.getElementById("ddappurl").value=a;
		//window.parent.document.getElementById("ddupfile").style.display="none";
	}

</script>
