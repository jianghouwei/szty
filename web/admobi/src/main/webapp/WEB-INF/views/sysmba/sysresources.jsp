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
<script type="text/javascript" src="admjs/sysresources.js"></script>
<title>会员管理</title>
</head>
<body>
	<table table id="tt" class="easyui-datagrid" url="resourcesList"
		toolbar="#tb" title="Load Data" iconCls="icon-save" rownumbers="true"
		pagination="true" fit="true"  fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th data-options="field:'resourcesName'">资源名称</th>
				<th data-options="field:'resourcesPath'">资源地址</th>
				<th data-options="field:'resourcesCode'">资源编码</th>
				<th data-options="field:'adds'">新增按钮</th>
				<th data-options="field:'deletes'">删除按钮</th>
				<th data-options="field:'views'">查看按钮</th>
				<th data-options="field:'edits'">修改按钮</th>
				<th data-options="field:'exports'">导出按钮</th>
				<th data-options="field:'imports'">导入按钮</th>
				<th data-options="field:'uploads'">上传按钮</th>
			</tr>
		</thead>
	</table>
	<div id="tb" style="padding: 5px; height: auto">
		<div style="margin-bottom: 5px">
			<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">新增</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">编辑</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">删除</a>
		</div>
		<!-- <div>
			Date From: <input class="easyui-datebox" style="width: 80px">
			To: <input class="easyui-datebox" style="width: 80px">
			Language: <select class="easyui-combobox" panelHeight="auto"
				style="width: 100px">
				<option value="java">Java</option>
				<option value="c">C</option>
				<option value="basic">Basic</option>
				<option value="perl">Perl</option>
				<option value="python">Python</option>
			</select> <a href="#" class="easyui-linkbutton" iconCls="icon-search">Search</a>
		</div> -->
	</div>
     <!-- 新增和修改 -->
	<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
                closed="true" buttons="#dlg-buttons">
            <div class="ftitle">资源管理</div>
            <form id="fm" method="post" novalidate>
                <div class="fitem">
                    <label>资源地址:</label>
                    <input name="resourcesPath" class="easyui-textbox" required="true">
                </div>
                <div class="fitem">
                    <label>资源名称:</label>
                    <input name="resourcesName" class="easyui-textbox" required="true">
                </div>
                <div class="fitem">
                    <label>资源编码:</label>
                    <input name="resourcesCode" class="easyui-textbox" required="true">
                </div>
                <div class="fitem">
                    <label>新增按钮:</label>
                    <input name="adds" type="checkbox" value="1" class="easyui-checkbox" >
                </div>
                <div class="fitem">
                    <label>修改按钮:</label>
                    <input name="edits" type="checkbox" value="1" class="easyui-checkbox">
                </div>
                <div class="fitem">
                    <label>查看按钮:</label>
                    <input name="views" type="checkbox" value="1" class="easyui-checkbox">
                </div>
                <div class="fitem">
                    <label>删除按钮:</label>
                    <input name="deletes" type="checkbox" value="1" class="easyui-checkbox">
                </div>
                <div class="fitem">
                    <label>导入按钮:</label>
                    <input name="imports" type="checkbox" value="1" class="easyui-checkbox">
                </div>
                <div class="fitem">
                    <label>导出按钮:</label>
                    <input name="exports"  type="checkbox" value="1" class="easyui-checkbox">
                </div>
                <div class="fitem">
                    <label>上传按钮:</label>
                    <input name="uploads" type="checkbox" value="1" class="easyui-checkbox">
                </div>
            </form>
        </div>
        <div id="dlg-buttons">
            <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveUser()" style="width:90px">Save</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">Cancel</a>
        </div>
</body>