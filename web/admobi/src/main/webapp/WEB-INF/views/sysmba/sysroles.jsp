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
				iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
				 <a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-remove" plain="true" onclick="authRole()">角色权限</a>
		</div>
	</div>
	<!-- 新增和修改 -->
	<div id="dlg" class="easyui-dialog"
		style="width: 400px; height: 280px; padding: 10px 20px" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle">角色维护</div>
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
			iconCls="icon-ok" onclick="saveUser()" style="width: 90px">保存</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')"
			style="width: 90px">关闭</a>
	</div>

	<!-- 角色权限 -->
	<div id="dlg_AuthRole" class="easyui-dialog"
		style="width: 700px; height: 500px; padding: 1px 2px" closed="true"
		buttons="#dlgAuth-buttons">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'west',split:true" style="width: 350px">
				<ul id="ttroles" class="easyui-tree"
					data-options="url:'rolesTrees',method:'get',animate:true,checkbox:true"></ul>
			</div>
			<div data-options="region:'east',split:true" style="width: 350px">
				<ul id="ttauth" class="easyui-tree"
					data-options="url:'authTrees',method:'get',animate:true,checkbox:true"></ul>
			</div>
		</div>
	</div>
	<div id="dlgAuth-buttons">
		<a id="saveAuthButtom" href="javascript:void(0)"
			class="easyui-linkbutton c6" iconCls="icon-ok"
			onclick="authRoleSave()" style="width: 90px">保存</a> <a
			href="javascript:void(0)" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg_AuthRole').dialog('close')"
			style="width: 90px">关闭</a>
	</div>
</body>