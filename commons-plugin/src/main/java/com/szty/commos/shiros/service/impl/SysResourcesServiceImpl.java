package com.szty.commos.shiros.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szty.commos.page.model.PageModel;
import com.szty.commos.shiros.dao.SysResourcesMapper;
import com.szty.commos.shiros.model.SysResources;
import com.szty.commos.shiros.service.SysResourcesService;

@Service 
public class SysResourcesServiceImpl  implements SysResourcesService{

	@Autowired 
	private SysResourcesMapper SysResourcesMapper;

	
	public void saveSysResources(SysResources SysResources) {

		SysResourcesMapper.save(SysResources);
		
	}

	public void updateSysResources(SysResources SysResources) {

		SysResourcesMapper.updateByPrimaryKey(SysResources);
	}

	public void delSysResources(Long id) {
		
		SysResourcesMapper.delByPrimaryKey(id);
		
	}

	public List<SysResources> queryList(SysResources SysResources) {
		
		return SysResourcesMapper.queryList(SysResources);
	}

	public PageModel<SysResources, Object> queryPageSysResources(SysResources SysResources) {
		PageModel<SysResources, Object> page = new PageModel<SysResources, Object>();
		List<SysResources> rows = SysResourcesMapper.queryPageList(SysResources);
		Integer total = SysResourcesMapper.queryPageCount(SysResources);
		page.setRows(rows);
		page.setTotal(total);
		return page;
	}

}
