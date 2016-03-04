var url;
/**
 * 新增
 */
function newUser() {
	$('#dlg').dialog('open').dialog('center').dialog('setTitle', '新增');
	$('#fm').form('clear');
	url = 'rolesAdd?logo=add';
}
/**
 * 修改
 */
function editUser() {
	var row = $('#tt').datagrid('getSelected');
	if (row) {
		$('#dlg').dialog('open').dialog('center').dialog('setTitle','编辑');
		$('#fm').form('load', row);
		url = 'rolesEdit?logo=edit&id=' + row.id;
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
		$.messager.confirm('Confirm',
				'您确定删除该条数据？', function(r) {
					if (r) {
						$.post('rolesDel', {
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
