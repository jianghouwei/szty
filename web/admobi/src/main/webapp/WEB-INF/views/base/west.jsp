<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<div data-options="region:'west',title:'菜单栏'" style="width: 250px;">
	<div class="easyui-accordion" style="width: 100%; height: 100%;">
		<div title="系统管理"
			data-options="selected:true,iconCls:'icon-large-picture'"
			style="padding: 10px;">
			<p>
				<shiro:hasPermission name="admin:*,:user:*">
					<a href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-large-picture'"
						onclick="addTab('sysmba/sysuser', '用户管理')">用户管理</a>
				</shiro:hasPermission>
			</p>
			<p>
				<shiro:hasPermission name="admin:*,:role:*">
					<a href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-large-clipart',size:'large',"
						onclick="addTab('sysmba/sysroles', '角色管理')">角色管理</a>
				</shiro:hasPermission>
			</p>
			<p>
				<shiro:hasPermission name="admin:*,:resource:*">
					<a href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-large-shapes',size:'large',iconAlign:'top'"
						onclick="addTab('sysmba/sysresources', '资源管理')">资源管理</a>
				</shiro:hasPermission>
			</p>
			<p>
				<shiro:hasPermission name="admin:*,:group:*">
					<a href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-large-smartart',size:'large',iconAlign:'top'"
						onclick="addTab('sysmba/sysgroups', '组别管理')">组别管理</a>
				</shiro:hasPermission>
			</p>
		</div>
		<div title="报表管理" data-options="selected:true" style="padding: 10px">
			<p>统计报表</p>
			<p>会员报表</p>
			<p>账务报表</p>
			<p>下载排行</p>
		</div>

	</div>

</div>
<script type="text/javascript">
	function addTab(url, title) {
		if ($('#tabs').tabs('exists', title)) {
			$('#tabs').tabs('select', title);
		} else {
			var content = '<iframe scrolling="auto" frameborder="0"  src="'
					+ url + '" style="width:100%;height:100%;"></iframe>';
			$('#tabs').tabs('add', {
				title : title,
				content : content,
				closable : true
			});
		}
	}
</script>












</div>