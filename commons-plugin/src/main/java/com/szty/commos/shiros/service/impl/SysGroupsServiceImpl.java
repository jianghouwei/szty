package com.szty.commos.shiros.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stzy.commos.page.model.PageModel;
import com.szty.commos.shiros.dao.SysGroupsMapper;
import com.szty.commos.shiros.model.SysGroups;
import com.szty.commos.shiros.service.SysGroupsService;

/**
 * 组别管理
 * ClassName: SysGroupsServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月4日 下午3:51:40 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
@Service
public class SysGroupsServiceImpl implements SysGroupsService {

	@Autowired
	private  SysGroupsMapper sysGroupsMapper;
	
	@Override
	public void saveSysGroups(SysGroups sysGroups) {
		
		sysGroupsMapper.save(sysGroups);
	}

	@Override
	public void updateSysGroups(SysGroups sysGroups) {
		sysGroupsMapper.updateByPrimaryKey(sysGroups);
	}

	@Override
	public void delSysGroups(Long id) {
		sysGroupsMapper.delByPrimaryKey(id);
	}

	@Override
	public List<SysGroups> queryList(SysGroups sysGroups) {
		return sysGroupsMapper.queryList(sysGroups);
	}

	@Override
	public PageModel<SysGroups, Object> queryPageSysGroups(SysGroups sysGroups) {
		PageModel<SysGroups, Object> page = new PageModel<SysGroups, Object>();
		List<SysGroups> rows = sysGroupsMapper.queryPageList(sysGroups);
		Integer total = sysGroupsMapper.queryPageCount(sysGroups);
		page.setRows(rows);
		page.setTotal(total);
		return page;
	}

}
