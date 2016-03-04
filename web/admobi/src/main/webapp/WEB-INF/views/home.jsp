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
<jsp:include page="common/head.jsp" />

<!-- 当前页面jscss -->
<link rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
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
				<div style="margin: 20px 0;"></div>
				<table
					class="easyui-datagrid table table-striped table-bordered bootstrap-datatable datatable responsive"
					style="width:100%;height:100%"
					data-options="rownumbers:true,
					singleSelect:true,
					url:'datagrid_data1.json',method:'get',
					toolbar:'#tb',footer:'#ft'">
					<thead>
						<tr>
							<th data-options="field:'itemid',width:80">Item ID</th>
							<th data-options="field:'productid',width:100">Product</th>
							<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
							<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
							<th data-options="field:'attr1',width:240">Attribute</th>
							<th data-options="field:'status',width:60,align:'center'">Status</th>
						</tr>
					</thead>
				</table>
				<div id="tb" style="padding: 2px 5px;">
					Date From: <input class="easyui-datebox" style="width: 110px">
					To: <input class="easyui-datebox" style="width: 110px">
					Language: <select class="easyui-combobox" panelHeight="auto"
						style="width: 100px">
						<option value="java">Java</option>
						<option value="c">C</option>
						<option value="basic">Basic</option>
						<option value="perl">Perl</option>
						<option value="python">Python</option>
					</select> <a href="#" class="easyui-linkbutton" iconCls="icon-search">Search</a>
				</div>
				<div id="ft" style="padding: 2px 5px;">
					<a href="#" class="easyui-linkbutton" iconCls="icon-add"
						plain="true"></a> <a href="#" class="easyui-linkbutton"
						iconCls="icon-edit" plain="true"></a> <a href="#"
						class="easyui-linkbutton" iconCls="icon-save" plain="true"></a> <a
						href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true"></a>
					<a href="#" class="easyui-linkbutton" iconCls="icon-remove"
						plain="true"></a>
				</div>
				<!-- content ends -->
			</div>
		</div>
	</div>
	<!--/fluid-row-->
	<jsp:include page="common/footer.jsp" flush="true" />
	</div>
</html>