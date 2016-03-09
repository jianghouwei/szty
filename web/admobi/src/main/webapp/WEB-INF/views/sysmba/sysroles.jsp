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
<jsp:include page="../base/c_head.jsp"></jsp:include>
<script type="text/javascript" src="admjs/sysroles.js"></script>
<title>会员管理</title>
</head>
<body>
	<table table id="tt" class="easyui-datagrid" url="rolesList"
		toolbar="#tb" title="Load Data" iconCls="icon-save" rownumbers="true"
		pagination="true" fit="true" fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th data-options="field:'roleName'">角色名称</th>
				<th data-options="field:'roleCode'">角色编码</th>
			</tr>
		</thead>
	</table>
	<div id="tb" style="padding: 5px; height: auto">
		<div style="margin-bottom: 5px">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-add" plain="true" onclick="newUser()">新增</a> <a
				href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a> <a
				href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a> <a
				href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-add" plain="true" onclick="$('#w').window('open')">角色权限管理</a>
		</div>
	</div>
	<!-- 新增和修改 -->
	<div id="dlg" class="easyui-dialog"
		style="width: 400px; height: 280px; padding: 10px 20px" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle">User Information</div>
		<form id="fm" method="post" novalidate>
			<div class="fitem">
				<label>角色名称:</label> <input name="roleName" class="easyui-textbox"
					required="true">
			</div>
			<div class="fitem">
				<label>角色编码:</label> <input name="roleCode" class="easyui-textbox"
					required="true">
			</div>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="saveUser()" style="width: 90px">Save</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')"
			style="width: 90px">Cancel</a>
	</div>


	<div id="w" class="easyui-window" title="角色权限"
		data-options="iconCls:'icon-save'"
		style="width: 500px; height: 200px; padding: 5px;">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'east',split:true title='角色'"
				style="width: 100px">
				<ul id="ttRoles" class="easyui-tree" data-options="url:'rolesTrees',method:'get',animate:true,checkbox:true"></ul>
			</div>
			<div data-options="region:'center'split:true title='权限'"
				style="padding: 10px;">
				<ul id="ttAuth" class="easyui-tree" data-options="url:'authTrees',method:'get',animate:true,checkbox:true"></ul>
			</div>
			<div data-options="region:'south',border:false"
				style="text-align: right; padding: 5px 0 0;">
				<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'"
					href="javascript:void(0)" onclick="onsave()" style="width: 80px">保存</a>
				<a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'"
					href="javascript:void(0)" onclick="$('#w').window('close')"
					style="width: 80px">关闭</a>
			</div>
		</div>
	</div>
</body>