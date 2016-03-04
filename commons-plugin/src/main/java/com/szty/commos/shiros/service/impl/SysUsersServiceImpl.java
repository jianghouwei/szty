package com.szty.commos.shiros.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stzy.commos.page.model.PageModel;
import com.szty.commos.shiros.dao.SysUsersMapper;
import com.szty.commos.shiros.model.SysUsers;
import com.szty.commos.shiros.service.SysUsersService;

/**
 * 用户CRUD
 * ClassName: SysUsersServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 上午11:13:26 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
@Service
public class SysUsersServiceImpl implements SysUsersService {
	
	@Autowired
	private SysUsersMapper sysUsersMapper;
	
	@Override
	public void saveSysUser(SysUsers sysUsers) {
		sysUsersMapper.save(sysUsers);
		
	}

	@Override
	public void updateSysUser(SysUsers sysUsers) {
		sysUsersMapper.updateByPrimaryKey(sysUsers);
		
	}

	@Override
	public void delSysUser(Long id) {
		sysUsersMapper.delByPrimaryKey(id);
		
	}

	@Override
	public List<SysUsers> queryList(SysUsers sysUsers) {
		return sysUsersMapper.queryList(sysUsers);
	}

	@Override
	public PageModel<SysUsers, Object> queryPageSysUser(SysUsers sysUsers) {
		PageModel<SysUsers, Object> page = new PageModel<SysUsers, Object>();
		List<SysUsers> rows = sysUsersMapper.queryPageList(sysUsers);
		Integer total = sysUsersMapper.queryPageCount(sysUsers);
		page.setRows(rows);
		page.setTotal(total);
		return page;
	}

}
