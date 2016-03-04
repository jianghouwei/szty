package com.szty.commos.shiros.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stzy.commos.page.model.PageModel;
import com.szty.commos.shiros.dao.SysRolesMapper;
import com.szty.commos.shiros.model.SysRoles;
import com.szty.commos.shiros.service.SysRolesService;

@Service 
public class SysRolesServiceImpl implements SysRolesService{

	
	@Autowired
	private SysRolesMapper sysRolesMapper;
	@Override
	public void saveSysRoles(SysRoles sysRoles) {
		sysRolesMapper.save(sysRoles);
		
	}

	@Override
	public void updateSysRoles(SysRoles sysRoles) {

		sysRolesMapper.updateByPrimaryKey(sysRoles);
	}

	@Override
	public void delSysRoles(Long id) {

		sysRolesMapper.delByPrimaryKey(id);
		
	}

	@Override
	public List<SysRoles> queryList(SysRoles sysRoles) {
 		return sysRolesMapper.queryList(sysRoles);
	}

	@Override
	public PageModel<SysRoles, Object> queryPageSysRoles(SysRoles sysRoles) {
		PageModel<SysRoles, Object> page = new PageModel<SysRoles, Object>();
		List<SysRoles> rows = sysRolesMapper.queryPageList(sysRoles);
		Integer total = sysRolesMapper.queryPageCount(sysRoles);
		page.setRows(rows);
		page.setTotal(total);
		return page;
	}

}
