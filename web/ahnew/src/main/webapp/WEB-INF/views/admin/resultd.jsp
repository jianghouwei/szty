<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript">
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${title }</title>
<link href="css/base.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.np {
	border: 0px
}
</style>

<style type="text/css">
body {
	background: #b9b9b;
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
</head>
<body leftmargin="8" topmargin="8" background='images/allbg.gif'>
	<form id="form1" style="background:#b9b9b9;">
		<input type="hidden" value="" name="checkvalue" id="checkvalue" />

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
			<tr>
				
			</tr>
		</table>
		<!-- <div style="margin:40px auto;width:100%;text-align:center;"><Button style="width:160px;height:40px;"
					onclick="window.parent.document.getElementById('frame1').style.display='none';">关闭</Button></div> -->
	</form>
</body>
</html>
<iframe src="" name="frame1" id="frame1"
	style="width: 600px; height: 400px; display: none"></iframe>
<script type="text/javascript">
	function showdetail(obj) {
		var iWidth = 600; //窗口宽度 
		var iHeight = 400;//窗口高度 
		var iTop = (window.screen.height - iHeight - 200) / 2;
		var iLeft = ((window.screen.width) - iWidth - 400) / 2;
		var a = document.getElementById("frame1");
		a.src = "detailorder?m=Math(9)&aid=" + obj;
		a.style.display = "block";
		a.style.position = "absolute";
		a.style.left = iLeft + "px";
		a.style.top = iTop + "px";
	}
</script>
