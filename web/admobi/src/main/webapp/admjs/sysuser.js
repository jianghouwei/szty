$(function() {

	$('#tt').datagrid({
		rowStyler : function(index, row) {
			if (index % 2 == 1) {
				return 'background-color:pink;color:blue;font-weight:bold;';
			}
		}
	});
	
	/**
	 * 点击用户节点== 获取 该角色信息
	 */
	$('#ttusers').tree({
		
		onClick: function(node){
			$("#ttroles").tree("options").url='rolesCheckTrees?userId='+node.id;
			$('#ttroles').tree('reload');
		}
	});
});

var url;
/**
 * 新增
 */
function newUser() {
	$('#dlg').dialog('open').dialog('center').dialog('setTitle', '新增');
	$('#fm').form('clear');
	url = 'usersAdd?logo=add';
}
/**
 * 修改
 */
function editUser() {
	var row = $('#tt').datagrid('getSelected');
	// var row = $('#tt').datagrid('getSelections');
	if (row) {
		$('#dlg').dialog('open').dialog('center').dialog('setTitle', '编辑');
		$('#fm').form('load', row);
		url = 'usersEdit?logo=edit&id=' + row.id;
	}
}
/**
 * 提交数据
 */
function saveUser() {
	$('#fm').form('submit', {
		url : url,
		onSubmit : function() {
			return $(this).form('validate');
		},
		success : function(result) {
			var result = eval('(' + result + ')');
			if (!result.code == 'ok') {
				$.messager.show({
					title : 'Error',
					msg : result.errorMsg
				});
			} else {
				$('#dlg').dialog('close'); // close the dialog
				$('#tt').datagrid('reload'); // reload the user data
			}
		}
	});
}
/**
 * 删除
 */
function destroyUser() {
	var row = $('#tt').datagrid('getSelected');
	if (row) {
		$.messager.confirm('Confirm', '您确定删除该条数据？', function(r) {
			if (r) {
				$.post('usersDel', {
					id : row.id
				}, function(result) {
					if (result.code == 'ok') {
						$('#tt').datagrid('reload'); // reload the
					} else {
						$.messager.show({ // show error message
							title : 'Error',
							msg : result.errorMsg
						});
					}
				}, 'json');
			}
		});
	}
}

/**
 * 分配角色
 */
function assignRole() {
	$('#dlg_assignRole').dialog('open').dialog('center').dialog('setTitle',
			'角色分配');
	
}
/**
 * 分配角色
 */
function assignRoleSave() {
	
	var userIds = getChecked("ttusers");
	var roleIds = getChecked("ttroles");
	$.ajax({
		type : "GET",
		url :"rolesUsers",
		async : false,
		data : {
			userIds:userIds,
			roleIds:roleIds
		},
		success : function(data) {
		}
	});
}

/**
 * 获取选择节点Id
 */
function getChecked(treeId){
	var nodes = $('#'+treeId).tree('getChecked');
	var s = '';
	for(var i=0; i<nodes.length; i++){
		if (s != '') s += ',';
		s += nodes[i].id;
	}
	return s;
}

