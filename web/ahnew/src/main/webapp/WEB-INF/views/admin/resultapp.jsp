<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${title }</title>
<link href="<spring:message code="url.main" />css/base.css" rel="stylesheet" type="text/css" />
<style>
.np {
	border: 0px
}
</style>

<style type="text/css">
body{
background:#b9b9b9;
}
#pagefoot {
	width: 100%, height:25px;
	float：right;
}

#pagefoot ul {
	display: block;
	margin-left: 300px; float：right;
	width: 90%;
	margin-top: 10px
}

#pagefoot li {
	float: left;
	display: block;
}

#pagefoot li a {
	margin-left: 5px;
	float: left;
	display: block;
	width: 35px;
	text-align: center;
	height: 25px;
	background: #FBFCE2;
	border: 1px solid #333333
}

.cli li a {
	margin-left: 5px;
	float: left;
	display: block;
	width: 35px;
	text-align: center;
	height: 25px;
	background: #850000
}

tr {
	height: 30px;
	line-height: 30px;
	background: #fff;
}

tr.title {
	height: 30px;
	line-height: 30px;
	background: #090900;
	color: #fff;
}

td {
	border: 1px solid #a9a9a9;
	text-align: center;
}

select {
	width: 140px;
	height: 30px;
}
</style>
<script type="text/javascript">
	function checkall() {

		var b = document.getElementsByTagName('input');
		alert('ccc2');
		for (var i = 0; i < b.length; i++) {
			if (b[i].type == 'checkbox') {
				b[i].checked = true;
			}

		}

	}
	function setchecked(obj, value) {

		var a = document.getElementById('checkvalue');
		a.value = a.value.replace(value + ",", "");
		if (obj.checked == true) {
			a.value = a.value + value + ",";
		}

	}
	function search1() {
		var a = document.getElementById('d');
		if (a != '')
			this.form1.submit();
	}
</script>
<style  type="text/css">
html, body {
	font-size: 12px;
	margin: 0px;
	height: 100%;
}
table{
border-collapse: collapse;}
.mesWindow {
	width: 1200px;
	height: 400px; border : #666 1px solid;
	background: #fff;
	border: #666 1px solid;
}

.mesWindowTop {
	border-bottom: #eee 1px solid;
	margin-left: 4px;
	padding: 3px;
	font-weight: bold;
	text-align: left;
	font-size: 12px;
}

.mesWindowContent {
	margin: 4px;
	font-size: 12px;
	height:80%;
	
}

.mesWindow .close {
	height: 25px;
	width: 60px;
	border: none;
	cursor: pointer;
	text-decoration: none;
	background: #fff;
	margin-right:40px;
}
</style>
<script>
	var isIe = (document.all) ? true : false;
	//设置select的可见状态
	function setSelectState(state) {
		var objl = document.getElementsByTagName('select');
		for (var i = 0; i < objl.length; i++) {
			objl[i].style.visibility = state;
		}
	}
	function mousePosition(ev) {
		if (ev.pageX || ev.pageY) {
			return {
				x : ev.pageX,
				y : ev.pageY
			};
		}
		return {
			x : ev.clientX + document.body.scrollLeft
					- document.body.clientLeft,
			y : ev.clientY + document.body.scrollTop - document.body.clientTop
		};
	}
	//弹出方法
	function showMessageBox(wTitle, content, pos, wWidth,objId) {
		closeWindow();
		var bWidth = parseInt(document.documentElement.scrollWidth);
		var bHeight = parseInt(document.documentElement.scrollHeight);
		if (isIe) {
			setSelectState('hidden');
		}
		var back = document.createElement("div");
		back.id = "back";
		var styleStr = "top:0px;left:0px;position:absolute;background:#666;width:"
				+ bWidth + "px;height:" + bHeight + "px;";
		styleStr += (isIe) ? "filter:alpha(opacity=0);" : "opacity:0;";
		back.style.cssText = styleStr;
		document.body.appendChild(back);
		showBackground(back, 50);
		var mesW = document.createElement("div");
		mesW.id = "mesWindow";
		mesW.className = "mesWindow";
		mesW.innerHTML = "<div class='mesWindowTop'><table width='100%' height='100%'><tr><td>"
				+ wTitle
				+ "</td><td style='width:1px;'><input type='button' onclick='closeWindow();' title='关闭窗口' class='close' value='关闭' /></td></tr></table></div><div class='mesWindowContent' id='mesWindowContent'>"+"<iframe src=\"detailorder?m=Math(9)&aid="+objId+"\"  name=\"frame1\" id=\"frame1\" style=\"width:100%;height:100%;background:#b9b9b9;\"></iframe>"+"</div><div class='mesWindowBottom'></div>";

		var v_top = (document.body.clientHeight - mesW.clientHeight) / 2;
		v_top += document.documentElement.scrollTop;
		styleStr = "top:"
				+ (v_top - 180)
				+ "px;left:"
				+ (document.body.clientWidth / 2 - mesW.clientWidth / 2)
				+ "px;position:absolute;width:"+wWidth+"px;margin-left:-"+wWidth/2+"px;left:50%;z-index:9999;";
		mesW.style.cssText = styleStr;
		document.body.appendChild(mesW);
	}
	//让背景渐渐变暗
	function showBackground(obj, endInt) {
		if (isIe) {
			obj.filters.alpha.opacity += 5;
			if (obj.filters.alpha.opacity < endInt) {
				setTimeout(function() {
					showBackground(obj, endInt)
				}, 5);
			}
		} else {
			var al = parseFloat(obj.style.opacity);
			al += 0.05;
			obj.style.opacity = al;
			if (al < (endInt / 100)) {
				setTimeout(function() {
					showBackground(obj, endInt)
				}, 5);
			}
		}
	}
	//关闭窗口
	function closeWindow() {
		if (document.getElementById('back') != null) {
			document.getElementById('back').parentNode.removeChild(document
					.getElementById('back'));
		}
		if (document.getElementById('mesWindow') != null) {
			document.getElementById('mesWindow').parentNode
					.removeChild(document.getElementById('mesWindow'));
		}
		if (isIe) {
			setSelectState('');
		}
	}
	//测试弹出
	function testMessageBox(ev,id) {
		var objPos = mousePosition(ev);
		messContent = "<div style='padding:20px 0 20px 0;text-align:center'>消息正文</div>";
		var cwidth=document.getElementById('form1').scrollWidth*0.8;
		showMessageBox('窗口标题', messContent, objPos, parseInt(cwidth),id);
	}
	 function getBrowserWindowSize(){
		  var de = document.documentElement ; 
		  return {
		    width:( window.innerWidth
		      || (de&&de.clientWidth)
		      || document.body.offsetWidth
		       ),
		    height:( window.innerHeight
		         || (de&&de.clientHeight)
		      || document.body.offsetHeight
		      )
		    };
		 }
</script>
</head>
<body style="background:url(<spring:message code="url.main" />images/allbg.gif);margin:8px;">
	<form id="form1">
		<input type="hidden" value="" name="checkvalue" id="checkvalue" />
		<table width="98%" height="31" border="0" align="center"
			cellpadding="1" cellspacing="1" class="tbtitle"
			style="border: 1px solid #CFCFCF; margin-top: 6px; border-bottom: none;">
			<tr>
				<td class="tbtitletxt" background='<spring:message code="url.main" />../images/tbg.gif'><strong>&nbsp;列表：</strong>
				</td>
				<td>分类:<select id="cateselect" name="cateselect"
					onchange='this.form.submit();'>${cate}</select>
				</td>
				<td>条件搜索:<input type="text" name="d" id="d" value="" />&nbsp;&nbsp;
					<input type="button" onclick="search1();" id="search" value="搜索" />&nbsp;&nbsp;
					<font color="red"></font></td>
				<td>页面:<select id="pageselect" name="pageselect"
					onchange='this.form.submit();'>${page}</select><input type="button"
					onclick="checkall();return false;" value="全选" />
				</td>

			</tr>
		</table>
		<table width="98%" border="0" cellpadding="1" cellspacing="1"
			align="center" style="border: 1px solid #CFCFCF;" id="tbl_info">

			<tr align="center">
				<td height="120" align="left" valign="top" bgcolor="#FFFFFF"
					style="padding: 6px; padding-bottom: 20px">


					<table width="100%" border="0" cellpadding="3" cellspacing="1"
						bgcolor="#cfcfcf">${result}

					</table>
				</td>
			</tr>

		</table>
	</form>
</body>
<iframe src="" name="frame1" id="frame1" style="width:800px;height:200px;display:none;background:#b9b9b9;"></iframe>
</html>

<!-- <script type="text/javascript">
function showdetail(obj){
	var iWidth = 300; //窗口宽度 
	var iHeight = 250;//窗口高度 
	var iTop = (window.screen.height - iHeight - 200) / 2;
	var iLeft = ((window.screen.width) - iWidth - 400) / 2;
	var a = document.getElementById("frame1");
	a.src = "detailorder?m=Math(9)&aid="+obj;
	a.style.display = "block";
	a.style.position = "absolute";
	a.style.left = iLeft + "px";
	a.style.top = iTop + "px";
} -->


</script>



