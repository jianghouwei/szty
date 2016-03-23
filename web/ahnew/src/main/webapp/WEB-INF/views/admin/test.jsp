<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>网页中弹出小窗口,页面背景逐渐变为半透明</title>
<style>
html, body {
	font-size: 12px;
	margin: 0px;
	height: 100%;
}

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
	function testMessageBox(ev) {
		var objPos = mousePosition(ev);
		messContent = "<div style='padding:20px 0 20px 0;text-align:center'>消息正文</div>";
		showMessageBox('窗口标题', messContent, objPos, 1200,32);
	}
</script>
</head>
<body>
	<div style="padding: 20px">
		<div style="text-align: left";>
			<a href="#none" onclick="testMessageBox(event);">弹出窗口</a>
		</div>

	</div>
</body>
</html>
